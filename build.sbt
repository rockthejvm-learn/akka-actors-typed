ThisBuild / organization := "com.example.akka"
ThisBuild / version      := "1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"
ThisBuild / scalacOptions ++= Seq(
  "-deprecation",
  "-language:postfixOps"
)

lazy val root = (project in file("."))
  .settings(
    name := "akka-actors-typed",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-actor-typed" % "2.6.18",
      "com.typesafe.akka" %% "akka-actor-testkit-typed" % "2.6.18",
      "org.scalatest" %% "scalatest" % "3.2.9",
      "ch.qos.logback" % "logback-classic" % "1.2.10"
    )
  )
