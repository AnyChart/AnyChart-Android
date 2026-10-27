#!/usr/bin/env bash
# The epic's device-only checks in one go, on the attached phone (INTEG-5, 7, 8, 9):
#   1. connectedDebugAndroidTest on anychart-core (conformance set, callback tooltip, lifecycle),
#      anychart-dsl (Java host) and anychart-compose (Compose test rule), one module at a time;
#   2. the on-device callback round-trip cost from logcat (tag INTEG-5);
#   3. the sample installed, every gallery chart and every demo screen opened and screencapped.
# Results land in conformance/device/<timestamp>/ (gitignored): per-module Gradle logs and JUnit
# XML, the logcat extract, and the screenshots to walk through by eye.
#   ./device-checks.sh            everything
#   ./device-checks.sh tests      only 1 and 2
#   ./device-checks.sh walk       only 3
set -uo pipefail
cd "$(dirname "$0")"
ADB=${ADB:-$HOME/Android/Sdk/platform-tools/adb}
export JAVA_HOME=${JAVA_HOME:-/opt/android-studio/jbr}
GRADLE="./gradlew --no-daemon -q -Dorg.gradle.jvmargs=-Xmx1536m -Pkotlin.compiler.execution.strategy=in-process"
what=${1:-all}
out=conformance/device/$(date +%Y%m%d-%H%M)
mkdir -p "$out"

echo "waiting for a device..."
"$ADB" wait-for-device
"$ADB" devices -l | tee "$out/device.txt"
"$ADB" shell getprop ro.product.model | tee -a "$out/device.txt"
"$ADB" shell 'dumpsys package com.google.android.webview | grep versionName | head -1' | tee -a "$out/device.txt"

status=0
if [[ $what == all || $what == tests ]]; then
  "$ADB" logcat -c
  for m in anychart-core anychart-dsl anychart-compose; do
    echo "== $m connectedDebugAndroidTest"
    if $GRADLE ":$m:connectedDebugAndroidTest" > "$out/$m.log" 2>&1; then echo "   green"; else echo "   FAILED (see $out/$m.log)"; status=1; fi
    cp -r "$m/build/outputs/androidTest-results/connected" "$out/$m-results" 2>/dev/null || true
    # one line per test from the JUnit XML
    for x in "$out/$m-results"/*/*.xml "$out/$m-results"/*.xml; do
      [[ -f $x ]] || continue
      python3 -I - "$x" <<'PY'
import sys, xml.etree.ElementTree as ET
for s in ET.parse(sys.argv[1]).getroot().iter('testsuite'):
    print(f"   {s.get('name')}: {s.get('tests')} tests, {s.get('failures')} failures, {s.get('errors')} errors")
    for c in s.iter('testcase'):
        f = c.find('failure') if c.find('failure') is not None else c.find('error')
        print(f"     {'FAIL' if f is not None else 'ok  '} {c.get('name')} ({c.get('time')}s)")
        if f is not None: print("          " + " ".join((f.get('message') or f.text or '').split())[:300])
PY
    done
    "$ADB" logcat -d -s INTEG-5 >> "$out/integ5-logcat.txt"   # per module: the buffer rolls over before the loop ends
  done
  echo "== callback round trip on device (logcat INTEG-5):"; grep -h "RenderReport" "$out/integ5-logcat.txt" || echo "   (no INTEG-5 line: the sankey callback test did not log)"
fi

if [[ $what == all || $what == walk ]]; then
  echo "== sample install"
  $GRADLE :sample-core:installDebug > "$out/sample-install.log" 2>&1 || { echo "   install FAILED (see $out/sample-install.log)"; status=1; }
  pkg=com.anychart.samplecore
  shot() { sleep "${2:-4}"; "$ADB" exec-out screencap -p > "$out/$1.png"; echo "   $1.png"; }
  echo "== gallery, every chart"
  names=$(grep -oE '^\s+"[a-z-]+" to \{' sample-core/src/main/kotlin/com/anychart/samplecore/Gallery.kt | grep -oE '"[a-z-]+"' | tr -d '"')
  for n in $names; do
    "$ADB" shell am start -W -S -n $pkg/.GalleryActivity --es chart "$n" > /dev/null
    shot "gallery-$n" 5
  done
  echo "== demo screens"
  for a in MultiChartActivity FragmentsActivity RecyclerActivity CoordinationActivity SideBySideActivity; do
    "$ADB" shell am start -W -S -n $pkg/.$a > /dev/null
    shot "screen-$a" 6
  done
  "$ADB" shell am force-stop $pkg
  echo "$(ls "$out"/*.png | wc -l) screenshots in $out"
fi
echo "done, status=$status, results in $out"
exit $status
