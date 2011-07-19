Notes on wrapper configuration:

You only need to put the wrapper jar, the sbt-launch jar and the scala library on the classpath here. Sbt-launch will get the dependencies your program needs to run.

Pass in 2 application parameters. The first is the main class, which is alwasy xsbt.boot.Boot, and the second is the path to the sbt-launch configuration file in the conf directory.

What you might want to change:

* REPO_HOME - point to the local repo. This is used just for the scala library.
* wrapper.app.parameter.2 - point to your particular launch file.
* memory allocation in wrapper.java.initmemory and wrapper.java.maxmemory

I have included 2 launch files. Hello.launch points to a single repo, and all the program's dependencies have to be in it. Hello-more-repos.launch looks in multiple repos that are, in this case, proxied by Nexus. You don't have to worry about pre-loading all the dependencies into the single repo, although that would be better for a production deployment.
