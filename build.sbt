import Dependencies._

name := "scala-1"

version := "0.1"

scalaVersion := "2.13.6"

lazy val data = project

lazy val core = project
  .dependsOn(data)
  .settings(
    libraryDependencies += scalaTest
  )

lazy val app = project.dependsOn(data, core)

lazy val root = (project in file("."))
  .aggregate(data, core, app)