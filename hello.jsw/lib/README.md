Copy 3 files into this directory:

* From JSW's lib directory, copy libwrapper.so and wrapper.jar into this directory.

    cp wrapper-linux-x86-64-x.y.z/lib/libwrapper.so lib
    cp wrapper-linux-x86-64-x.y.z/lib/wrapper.jar lib

* Put [sbt-launch.jar] [1] into this directory, too. 

    wget http://typesafe.artifactoryonline.com/typesafe/ivy-releases/org.scala-tools.sbt/sbt-launch/<version>/sbt-launch.jar lib

[1]: http://typesafe.artifactoryonline.com/typesafe/ivy-releases/org.scala-tools.sbt/sbt-launch/0.10.1/sbt-launch.jar "sbt-launch.jar"
