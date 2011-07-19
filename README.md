This code explores using sbt-lauch to automatically download a program and its dependences and run it. The idea for this example is from an [email thread on the sbt mailing list] [1]

This project contains

* hello.project - The source code for a simple hello-world project
* hello.deploy - Where the code is deployed and run. 
* hello.jsw - A deployment using Java Service Wrapper

This assumes there is a local repo for storing jars.

Running the Hello Example
=========================

- cd to hello.project and run sbt. Do a "run" to verify it says "Hello, World", then do a "publish" to push it to the repo.
- cd to hello.jsw, and run "bin/hello console". The output will look like

```
	$ bin/hello  console
	Running Simple Hello, World test deployment...
	wrapper  | --> Wrapper Started as Console
	wrapper  | Java Service Wrapper Community Edition 64-bit 3.5.9
	wrapper  |   Copyright (C) 1999-2011 Tanuki Software, Ltd. All Rights Reserved.
	wrapper  |     http://wrapper.tanukisoftware.com
	wrapper  |
	wrapper  | Launching a JVM...
	jvm 1    | WrapperManager: Initializing...
	jvm 1    | Getting net.java.dev.jna jna 3.2.3 ...
	jvm 1    | :: retrieving :: org.scala-tools.sbt#boot-app
	jvm 1    |      confs: [default]
	jvm 1    |      1 artifacts copied, 0 already retrieved (838kB/9ms)
	jvm 1    | Getting Scala 2.9.0-1 (for hello)...
	jvm 1    | :: retrieving :: org.scala-tools.sbt#boot-scala
	jvm 1    |      confs: [default]
	jvm 1    |      4 artifacts copied, 0 already retrieved (20447kB/19ms)
	jvm 1    | Getting example hello_2.9.0-1 1.0.1 ...
	jvm 1    | :: retrieving :: org.scala-tools.sbt#boot-app
	jvm 1    |      confs: [default]
	jvm 1    |      1 artifacts copied, 0 already retrieved (3kB/4ms)
	jvm 1    | Hello, World!
	wrapper  | <-- Wrapper Stopped
```

If you want to just run the program using sbt-launch directly, rather than via JSW, then to hello.sbt-launch. Then run "./launch @hello.launch"

[1]: https://groups.google.com/forum/#!msg/simple-build-tool/ofJjd4u31hA/4_JYgFa3ByIJ


