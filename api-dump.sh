#!/usr/bin/env bash
# The public API of a library module as one sorted text file, <module>/api/<module>.api: every
# public declaration of its Kotlin sources, so a change of surface shows in the diff and must be
# accepted by rerunning this. `--check` fails when the committed file is stale (the apiCheck).
#   ./api-dump.sh [--check] anychart-core anychart-dsl
# ponytail: grep over the sources. kotlinx binary-compatibility-validator 0.18.2 registers no tasks
# under AGP 9's built-in Kotlin (no kotlin-android plugin to hook), tried 2026-10-27.
set -euo pipefail
cd "$(dirname "$0")"
check=0; [[ "${1:-}" == "--check" ]] && { check=1; shift; }
status=0
for module in "$@"; do
  out="$module/api/$module.api"
  tmp=$(mktemp)
  for f in $(find "$module/src/main" -name '*.kt' | sort); do
    cls=$(grep -oE '^public (open |abstract |sealed |enum |data )*(class|object|interface) [A-Za-z0-9_]+' "$f" | head -1 | awk '{print $NF}' || true)
    grep -E '^\s*public (fun|var|val|const val|open class|abstract class|sealed class|enum class|class|object|interface|companion object)' "$f" \
      | sed -E 's/^\s+//; s/ = .*$//; s/\{$//; s/\s+$//' \
      | sed -E "s|^|${cls:-<top>}  |" || true
  done | sort -u > "$tmp"
  if [[ $check == 1 ]]; then
    if ! diff -u "$out" "$tmp" > /dev/null 2>&1; then
      echo "$out is stale: public API changed. Review the diff and rerun ./api-dump.sh $module to accept it." >&2
      diff -u "$out" "$tmp" | head -40 >&2 || true
      status=1
    else
      echo "$out: up to date ($(wc -l < "$out") declarations)"
    fi
  else
    mkdir -p "$(dirname "$out")"
    mv "$tmp" "$out"
    echo "$out: $(wc -l < "$out") declarations"
  fi
done
exit $status
