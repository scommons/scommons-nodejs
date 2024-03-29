
[![CI](https://github.com/scommons/scommons-nodejs/actions/workflows/ci.yml/badge.svg?branch=master)](https://github.com/scommons/scommons-nodejs/actions/workflows/ci.yml?query=workflow%3Aci+branch%3Amaster)
[![Coverage Status](https://coveralls.io/repos/github/scommons/scommons-nodejs/badge.svg?branch=master)](https://coveralls.io/github/scommons/scommons-nodejs?branch=master)
[![scala-index](https://index.scala-lang.org/scommons/scommons-nodejs/scommons-nodejs-core/latest.svg)](https://index.scala-lang.org/scommons/scommons-nodejs/scommons-nodejs-core)
[![Scala.js](https://www.scala-js.org/assets/badges/scalajs-1.8.0.svg)](https://www.scala-js.org)

## Scala Commons Node.js
[Scala.js](https://www.scala-js.org) facades for
[Node.js](https://nodejs.org/docs/latest-v12.x/api/documentation.html)
platform.


### How to add it to your project

```scala
val scommonsNodejsVer = "1.0.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "org.scommons.nodejs" %%% "scommons-nodejs-core" % scommonsNodejsVer,
  
  "org.scommons.nodejs" %%% "scommons-nodejs-test" % scommonsNodejsVer % "test"
)
```

Latest `SNAPSHOT` version is published to [Sonatype Repo](https://oss.sonatype.org/content/repositories/snapshots/org/scommons/), just make sure you added
the proper dependency resolver to your `build.sbt` settings:
```scala
resolvers += "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"
```

### How to use it

Facades for [Node.js](https://nodejs.org/docs/latest-v12.x/api/) APIs:
* [Process](core/src/main/scala/scommons/nodejs/Process.scala) => [tests](showcase/src/test/scala/scommons/nodejs/ProcessSpec.scala)
* [ChildProcess](core/src/main/scala/scommons/nodejs/ChildProcess.scala) => [tests](showcase/src/test/scala/scommons/nodejs/ChildProcessSpec.scala)
* [EventEmitter](core/src/main/scala/scommons/nodejs/raw/EventEmitter.scala) => [tests](showcase/src/test/scala/scommons/nodejs/EventEmitterSpec.scala)
* [FS](core/src/main/scala/scommons/nodejs/FS.scala) => [tests](showcase/src/test/scala/scommons/nodejs/FSSpec.scala)
  * [Constants](core/src/main/scala/scommons/nodejs/raw/FSConstants.scala) => [tests](showcase/src/test/scala/scommons/nodejs/StatsSpec.scala)
* [OS](core/src/main/scala/scommons/nodejs/raw/OS.scala) => [tests](showcase/src/test/scala/scommons/nodejs/OSSpec.scala)
* [Path](core/src/main/scala/scommons/nodejs/raw/Path.scala) => [tests](showcase/src/test/scala/scommons/nodejs/PathSpec.scala)
* [URL](core/src/main/scala/scommons/nodejs/raw/URL.scala) => [tests](showcase/src/test/scala/scommons/nodejs/URLSpec.scala)
* Stream
  * [Readable](core/src/main/scala/scommons/nodejs/raw/Readable.scala) => [tests](showcase/src/test/scala/scommons/nodejs/stream/ReadableSpec.scala)
  * [Writable](core/src/main/scala/scommons/nodejs/raw/Writable.scala) => [tests](showcase/src/test/scala/scommons/nodejs/stream/WritableSpec.scala)
* [Timers](core/src/main/scala/scommons/nodejs/raw/Timers.scala) => [tests](test/src/test/scala/scommons/nodejs/test/AsyncTestSpecTest.scala)
* [Buffer](core/src/main/scala/scommons/nodejs/Buffer.scala) => [tests](showcase/src/test/scala/scommons/nodejs/BufferSpec.scala)

Useful Scala APIs and utils:
* [StreamReader](core/src/main/scala/scommons/nodejs/util/StreamReader.scala) => [tests](showcase/src/test/scala/scommons/nodejs/util/StreamReaderSpec.scala)
* [SubProcess](core/src/main/scala/scommons/nodejs/util/SubProcess.scala) => [tests](showcase/src/test/scala/scommons/nodejs/util/SubProcessSpec.scala)

## Documentation

You can find more documentation [here](https://scommons.github.io/)
