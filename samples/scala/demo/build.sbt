import PlayKeys._

import Common.settings

name    := "scala-demo"

libraryDependencies ++= Seq(
  specs2 % "test",
  "ws.securesocial" %% "securesocial" % version.value,
  guice
)

resolvers += Resolver.sonatypeRepo("snapshots")

scalacOptions := Seq("-encoding", "UTF-8", "-Xlint", "-deprecation", "-unchecked", "-feature")

routesImport ++= Seq("scala.language.reflectiveCalls")
