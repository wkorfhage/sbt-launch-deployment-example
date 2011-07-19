Notes on wrapper configuration:

You only need to put the wrapper jar, the sbt-launch jar and the scala library on the classpath here. Sbt-launch will get the dependencies your program needs to run.

Pass in 2 application parameters. The first is the main class, which is alwasy xsbt.boot.Boot, and the second is the path to the sbt-launch configuration file in the conf directory.

What you will need to change:

* REPO_HOME - point to the local repo. This is used just for the scala library.
* wrapper.app.parameter.2 - point to your particular launch file.

What you might want to change:

* memory allocation in wrapper.java.initmemory and wrapper.java.maxmemory
