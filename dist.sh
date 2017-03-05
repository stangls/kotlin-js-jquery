#!/bin/bash

set -e

tstamp=$(stat -c%Y package.json)
tstampo=$(cat .package.json.tstamp 2>/dev/null || true)
if [ -z "$tstampo" ] || [ "$tstamp" -gt "$tstampo" ]; then
    echo "installing npm modules"
    npm install
    echo "$tstamp" > .package.json.tstamp
fi

echo "compiling"
./gradlew build

echo "browserifying"
browserify web/app.js -o dist/bundle.js
cp web/kotlin.js dist/

