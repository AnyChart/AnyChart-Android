#!/usr/bin/env bash
# The module's public API as one sorted text file: every public declaration of the hand-written and
# generated sources, so a regeneration shows its surface changes in the diff of anychart-dsl.api.
# ponytail: grep over the sources, not a binary-compatibility validator; the sources are the truth here.
set -euo pipefail
cd "$(dirname "$0")/.."
{
  for f in $(find src/main/kotlin -name '*.kt' | sort); do
    cls=$(grep -oE '^public (open |abstract |sealed |enum |data )*(class|object|interface) [A-Za-z0-9_]+' "$f" | head -1 | awk '{print $NF}' || true)
    grep -E '^\s*public (fun|var|val|const val|open class|abstract class|sealed class|enum class|class|object|interface)' "$f" \
      | sed -E 's/^\s+//; s/ = .*$//; s/\{$//; s/\s+$//' \
      | sed -E "s|^|${cls:-<top>}  |" || true
  done
} | sort -u > api/anychart-dsl.api
wc -l api/anychart-dsl.api
