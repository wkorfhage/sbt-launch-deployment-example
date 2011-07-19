This code explores using sbt-lauch to automatically download a program and its dependences and run it. The idea for this example is from an [email thread on the sbt mailing list] [1]

This project contains

* hello.project - The source code for a simple hello-world project
* hello.deploy - Where the code is deployed and run. 
* hello.jws - A deployment using Java Service Wrapper

This assumes there is a local repo for storing jars.

Running the Hello Example
=========================

- cd to hello.project and run sbt. Do a "run" to verify it says "Hello, World", then do a publish to push it to the repo.
- cd to hello.deploy. Then run "./launch @hello.launch"

[1]: https://groups.google.com/forum/#!msg/simple-build-tool/ofJjd4u31hA/4_JYgFa3ByIJ


