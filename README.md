[![Awesome KotlinBadge](https://kotlin.link/awesome-kotlin.svg)](https://github.com/KotlinBy/awesome-kotlin)

# Kotlin JS + typesafe jQuery

## Try it out

```bash
./dist.sh
```

open `dist/index.html`

## Further plans

* ~~make use of npm and broswerify~~
* integrate kotlinx

## Extension

It should be easy (not tested yet) to extend this project with other javascript libraries:

1. add npm-dependency to package.json
1. find typescript-file and transform it via [ts2kt](https://github.com/Kotlin/ts2kt) 
1. use it via ```require(...)```
