package definitions

import sbt.Keys._
import sbt._
import scommons.sbtplugin.project.CommonModule
import xerial.sbt.Sonatype.autoImport._

trait NodejsModule extends CommonModule {

  override val repoName = "scommons-nodejs"

  override def definition: Project = {
    super.definition
      .settings(NodejsModule.settings: _*)
  }
}

object NodejsModule {

  val settings: Seq[Setting[_]] = Seq(
    organization := "org.scommons.nodejs",
    
    //
    // publish/release related settings:
    //
    sonatypeProfileName := "org.scommons",
    publishMavenStyle := true,
    publishArtifact in Test := false,
    publishTo := sonatypePublishToBundle.value,
    pomExtra := {
      <url>https://github.com/scommons/scommons-nodejs</url>
        <licenses>
          <license>
            <name>Apache 2</name>
            <url>http://www.apache.org/licenses/LICENSE-2.0</url>
            <distribution>repo</distribution>
          </license>
        </licenses>
        <scm>
          <url>git@github.com:scommons/scommons-nodejs.git</url>
          <connection>scm:git@github.com:scommons/scommons-nodejs.git</connection>
        </scm>
        <developers>
          <developer>
            <id>viktorp</id>
            <name>Viktor Podzigun</name>
            <url>https://github.com/viktor-podzigun</url>
          </developer>
        </developers>
    },
    pomIncludeRepository := {
      _ => false
    }
  )
}
