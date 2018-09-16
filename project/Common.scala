import sbt._
import sbt.Keys._

object Common {
    val playVersion = System.getProperty("play.version", "2.6.15")
    val settings: Seq[Setting[_]] = Seq(
        version := System.getProperty("version", "maalka-SNAPSHOT"),
        scalaVersion :=System.getProperty("scala.version", "2.12.6"),
        crossScalaVersions := Seq("2.12.6", "2.11.12"),
        publishTo := Some("Artifactory Realm" at "https://jfrog.maalka.com/artifactory/libs-release-local"),
        credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")
    )
    val nonPublishSettings = settings ++ Seq(
        publish := { }
    )
}

