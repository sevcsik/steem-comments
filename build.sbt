enablePlugins(ScalaJSBundlerPlugin)

name := "Steem Comments Widget"
scalaVersion := "2.11.11"

scalaJSUseMainModuleInitializer := true
webpackBundlingMode := BundlingMode.LibraryOnly()
version in webpack := "2.2.1"

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.2"

npmDependencies in Compile += "@webcomponents/webcomponentsjs" -> "1.0.22"
npmDependencies in Compile += "@polymer/polymer" -> "2.3.1"

