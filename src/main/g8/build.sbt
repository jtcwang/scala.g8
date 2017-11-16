val thisScalaVersion = "2.12.4"

val root = Project("root", file("."))
  .settings(
      name := "$name$",
      organization := "$organization$",
      version := "$version$",
      scalaVersion := thisScalaVersion,
      crossScalaVersions := Seq("2.11.11", thisScalaVersion),

      libraryDependencies ++= Seq(
        "org.typelevel" %% "cats-core" % "0.9.0",

        "org.scalatest" %% "scalatest" % "3.0.4" % "test",
        "org.scalacheck" %% "scalacheck" % "1.13.5" % "test"
      )
  )
