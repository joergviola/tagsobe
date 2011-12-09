import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "tagsobe"
    val appVersion      = "1.0"

    val appDependencies = Seq(
      // Add your project dependencies here,
        "org.apache.commons" % "commons-email" % "1.2",
        "javax.mail" % "mail" % "1.4"
    )

    val main = PlayProject(appName, appVersion, appDependencies).settings(defaultJavaSettings:_*).settings(
      // Add your own project settings here      
    )

}
