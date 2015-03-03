name := """page2feed"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

libraryDependencies ++= Seq(
	jdbc,
	anorm,
	cache,
	ws,
	"org.postgresql" % "postgresql" % "9.4-1201-jdbc41",
	"net.ruippeixotog" %% "scala-scraper" % "0.1.1"
)
