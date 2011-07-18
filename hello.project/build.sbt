name := "hello"

organization := "example"

version := "1.0.1"

scalaVersion := "2.9.0-1"

libraryDependencies ++= Seq(
	"org.scala-tools.sbt" % "launcher-interface" % "0.10.0" % "provided"
)

resolvers += "Local Maven2 Repository" at "http://localhost:8081/nexus/content/groups/scala/"

resolvers += {
  val typesafeRepoUrl = new java.net.URL("http://repo.typesafe.com/typesafe/ivy-releases")
  val pattern = Patterns(false, "[organisation]/[module]/[revision]/[type]s/[module](-[classifier]).[ext]")
  Resolver.url("Typesafe Repository", typesafeRepoUrl)(pattern)
}

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")

publishTo <<= (version) { version: String =>
  val nexus = "http://localhost:8081/nexus/content/repositories/"
  if (version.trim.endsWith("SNAPSHOT")) Some("snapshots" at nexus+"snapshots/") 
  else                                   Some("releases" at nexus+"releases/")
}
