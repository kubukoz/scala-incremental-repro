lazy val root = (project in file("."))
  .settings(
    scalaVersion := "2.13.6",
    semanticdbEnabled := true,
  )
