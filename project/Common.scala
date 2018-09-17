import sbt._
import sbt.Keys._

object Common {
    val playVersion = System.getProperty("play.version", "2.6.15")
    val settings: Seq[Setting[_]] = Seq(
        version := System.getProperty("version", "maalka-2.6.0"),
        scalaVersion :=System.getProperty("scala.version", "2.12.6"),
        crossScalaVersions := Seq("2.12.6", "2.11.12")
    )
    val nonPublishSettings = settings ++ Seq(
        publish := { }
    )
}

