Common.nonPublishSettings

name := "SecureSocial-parent"

lazy val core =  project.in( file("module-code") ).enablePlugins(PlayScala).settings(Common.settings)

lazy val scalaDemo = project.in( file("samples/scala/demo") ).enablePlugins(PlayScala).dependsOn(core).settings(Common.nonPublishSettings)

lazy val javaDemo = project.in( file("samples/java/demo") ).enablePlugins(PlayJava).dependsOn(core).settings(Common.nonPublishSettings)

lazy val root = project.in( file(".") ).aggregate(core, scalaDemo, javaDemo) .settings(
     aggregate in update := false
   )

