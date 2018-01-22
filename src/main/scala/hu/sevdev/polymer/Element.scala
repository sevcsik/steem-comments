package hu.sevdev.polymer

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExportStatic
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

trait ElementDefinition {
  val is: String
  val template: String = null
  val properties: js.Object = null
  val observers: String = null
}

@js.native
@JSGlobal("window.customElements")
object customElements extends js.Object {
  def define(name: String, klass: js.Dynamic): Unit = js.native
}
