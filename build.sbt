import org.scalajs.core.tools.linker.standard._

enablePlugins(ScalaJSPlugin)
enablePlugins(JSDependenciesPlugin)

name := "Steem Comments Component"
scalaVersion := "2.12.4"

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.4"
libraryDependencies += "com.github.lukajcb" %%% "rxscala-js" % "0.15.2"
libraryDependencies += "io.github.shogowada" %%% "scala-json-rpc" % "0.9.3"

scalaJSUseMainModuleInitializer := true

scalaJSLinkerConfig ~= { _.withOutputMode(OutputMode.ECMAScript2015) }
scalacOptions += "-P:scalajs:sjsDefinedByDefault"

