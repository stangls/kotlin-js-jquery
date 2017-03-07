[![Awesome KotlinBadge](https://kotlin.link/awesome-kotlin.svg)](https://github.com/KotlinBy/awesome-kotlin)

# Kotlin JS + typesafe jQuery

## What it does

Allows to write Kotlin code and compile it to javascript including typesafe access to the jQuery library and other libraries (when converted using ts2kt, see below).
Packages everything together via browserify (require.js) for distribution.

## Try it out

```bash
./dist.sh
```

open `dist/index.html` in your browser.

You should now see an animated textual counter.

## Further plans

* ~~make use of npm and broswerify~~
* integrate kotlinx

## Extension

It should be easy (not tested yet) to extend this project with other javascript libraries:

1. add npm-dependency to package.json
1. find typescript-file and transform it via [ts2kt](https://github.com/Kotlin/ts2kt) 
1. use it via ```require(...)```
