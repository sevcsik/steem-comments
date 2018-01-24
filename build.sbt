import org.scalajs.core.tools.linker.standard._

enablePlugins(ScalaJSPlugin)
enablePlugins(JSDependenciesPlugin)

name := "Steem Comments Component"
scalaVersion := "2.11.11"

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.4"

scalaJSUseMainModuleInitializer := true

scalaJSLinkerConfig ~= { _.withOutputMode(OutputMode.ECMAScript2015) }
scalacOptions += "-P:scalajs:sjsDefinedByDefault"

