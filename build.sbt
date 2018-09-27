lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.ikempf",
      name := "play-json-macro-inifinite-loop",
      scalaVersion := "2.12.6"
    )),
    scalacOptions ++= List("-Ypartial-unification", "-Ymacro-debug-lite"),
    libraryDependencies ++= List(
      "org.typelevel" %% "cats-core" % "1.4.0",
      "com.github.julien-truffaut" %% "monocle-core" % "1.5.0",
      "com.github.julien-truffaut" %% "monocle-macro" % "1.5.0",
      "com.typesafe.play" %% "play-json" % "2.6.9"
    ),
    addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.6")
  )
