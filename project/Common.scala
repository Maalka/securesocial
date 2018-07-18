

object Common {
  def version = "master-SNAPSHOT"  
  def playVersion = System.getProperty("play.version", "2.6.15")
  def scalaVersion = System.getProperty("scala.version", "2.12.4")
  def crossScalaVersions = Seq(scalaVersion, "2.11.12")
}
