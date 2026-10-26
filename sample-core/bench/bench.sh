#!/usr/bin/env bash
export PATH=$PATH:/home/bepely/Android/Sdk/platform-tools
PKG=com.anychart.samplecore; OUT=$1; S=$(cd "$(dirname "$0")" && pwd)
: > "$OUT"
adb shell svc power stayon usb >/dev/null
adb shell input keyevent KEYCODE_WAKEUP; adb shell wm dismiss-keyguard >/dev/null 2>&1
echo "# cold starts, 7 per mode" >> "$OUT"
for mode in M0 M1 M2 M3; do
  adb shell "run-as $PKG sh -c 'mkdir -p files; echo $mode > files/bench-mode'"; echo "mode file: $(adb shell "run-as $PKG cat files/bench-mode" | tr -d "\r")" | tee -a "$OUT"
  for i in 1 2 3 4 5 6 7; do
    adb shell am force-stop $PKG; sleep 1.5
    adb logcat -c
    tt=$(adb shell am start -W -n $PKG/.BenchmarkActivity 2>/dev/null | grep TotalTime | tr -dc '0-9')
    sleep 4
    line=$(adb logcat -d 2>/dev/null | grep ACBENCH | grep -oE "mode=M[0-9] appToCreate=.*" | head -1)
    second=$(adb logcat -d 2>/dev/null | grep ACBENCH | grep -oE "secondLoadPageDraw=[0-9]+" | head -1)
    notes=$(adb logcat -d 2>/dev/null | grep ACBENCH | grep -oE "(M1|M2|M3) [a-zA-Z ]+ (in|at) [0-9]+ ms|M1 unsupported[^\"]*" | head -1)
    echo "$mode run=$i amTotalTime=$tt $line $second | $notes" | tee -a "$OUT"
  done
done
adb shell "run-as $PKG sh -c 'mkdir -p files; echo M0 > files/bench-mode'"
echo "# memory: PSS of every process of the package, kB" >> "$OUT"
renderers_before=$(adb shell ps -A -o PID,NAME | grep "webview:sandboxed" | awk '{print $1}' | tr "\n" " ")
mem(){ sleep $2; echo "scenario=$1" | tee -a "$OUT"; for pid in $(adb shell ps -A -o PID,NAME | grep "webview:sandboxed" | awk '{print $1}'); do case " $renderers_before " in *" $pid "*) ;; *) echo "  renderer pid=$pid pss_kB=$(adb shell dumpsys meminfo $pid | grep "TOTAL PSS:" | head -1 | awk '{print $3}')" | tee -a "$OUT";; esac; done; adb shell dumpsys meminfo $PKG 2>/dev/null | grep -E "^\*\* MEMINFO in pid|TOTAL PSS:" | sed 's/^\s*//' | paste - - | sed -E 's/\*\* MEMINFO in pid [0-9]+ \[([^]]+)\].*TOTAL PSS: +([0-9]+).*/  \1 pss_kB=\2/' | tee -a "$OUT"; adb shell "ps -A -o RSS,NAME | grep anychart" | sed 's/^/  ps rss_kB /' | tee -a "$OUT"; }
adb shell am force-stop $PKG; sleep 1.5
adb shell am start -W -n $PKG/.MainActivity >/dev/null 2>&1; mem "menu_no_webview" 4
python3 -I $S/tap.py "Gallery" >/dev/null; mem "gallery_1_webview" 5
adb shell input keyevent BACK; sleep 1; python3 -I $S/tap.py "Several charts" >/dev/null; mem "multi_3_webviews" 5
adb shell input keyevent BACK; sleep 1; python3 -I $S/tap.py "RecyclerView" >/dev/null; sleep 3; for k in 1 2 3 4 5 6; do adb shell input swipe 540 1900 540 500 300; sleep 0.5; done; mem "recycler_9_webviews_scrolled" 3
adb shell input keyevent BACK; sleep 1; python3 -I $S/tap.py "Fragments" >/dev/null; sleep 2; adb shell input swipe 950 1300 130 1300 250; sleep 1; adb shell input swipe 950 1300 130 1300 250; mem "fragments_pager_3_pages_alive" 3
adb shell input keyevent BACK; sleep 1; adb shell am force-stop $PKG
adb shell svc power stayon false >/dev/null
echo "# done" >> "$OUT"
