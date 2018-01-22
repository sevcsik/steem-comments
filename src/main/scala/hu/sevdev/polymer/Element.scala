package hu.sevdev.polymer

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import org.scalajs.dom.html

@js.native
@JSGlobal("Polymer.Element")
abstract class Element extends html.Element {
  var importPath: String = js.native
  var root: html.Element = js.native
  var rootPath: String = js.native
  def createPropertiesForAttributes: Unit = js.native
  //def finalize: Unit = js.native
  def attributeChangedCallback( name: String
                              , oldVal: String
                              , newVal: String
                              ): Unit = js.native
  def connectedCallback: Unit = js.native
  def disconnectedCallback: Unit = js.native
}

@js.native
@JSGlobal("Polymer.Element")
object Element extends js.Object {
  val is: String = js.native
  val template: String = js.native
  val properties: js.Object = js.native
  val observers: String = js.native
}
