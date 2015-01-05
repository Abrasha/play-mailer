import java.io.File
import PlayKeys._

name := "j"

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.1"

resolvers += Resolver.file("LocalIvy", file(Path.userHome + File.separator + ".ivy2" + File.separator + "local"))(Resolver.ivyStylePatterns)

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-mailer" % "2.4.0-RC1"
)

lazy val root = (project in file(".")).enablePlugins(PlayJava)