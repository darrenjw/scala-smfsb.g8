name := "$name$"

version := "0.1-SNAPSHOT"

scalacOptions ++= Seq(
  "-unchecked", "-deprecation", "-feature"
)

libraryDependencies  ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.8" % "test",
  //"org.scalanlp" %% "breeze" % "1.0",
  "org.scalanlp" %% "breeze-viz" % "1.0",
  //"org.scalanlp" %% "breeze-natives" % "1.0",
  "com.github.darrenjw" %% "scala-smfsb" % "0.7"
)

resolvers ++= Seq(
  "Sonatype Snapshots" at
    "https://oss.sonatype.org/content/repositories/snapshots/",
  "Sonatype Releases" at
    "https://oss.sonatype.org/content/repositories/releases/"
)

scalaVersion := "2.12.10"

