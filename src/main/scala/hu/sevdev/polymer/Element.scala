package hu.sevdev.polymer

import scala.scalajs.js
import scala.scalajs.js.annotation.{ JSGlobal, JSName }
import scala.reflect._
import org.scalajs.dom.html

@js.native
@JSGlobal("Polymer.Element")
abstract class Element extends html.Element {
  var importPath: String = js.native
  var root: html.Element = js.native
  var rootPath: String = js.native
  def createPropertiesForAttributes(): Unit = js.native
  @JSName("finalize")
  def finalizeElement(): Unit = js.native
  def attributeChangedCallback( name: String
                              , oldVal: String
                              , newVal: String
                              ): Unit = js.native
  def connectedCallback(): Unit = js.native
  def disconnectedCallback(): Unit = js.native
}

object Element {
  def define[T <: Element : js.ConstructorTag](companion: ElementCompanion): Unit = {
    js.Dynamic.global.customElements.define(companion.is, js.constructorTag[T].constructor)
  }
}

abstract class ElementCompanion {
  @JSName("get is")
  def is: String
  @JSName("get template")
  def template: String = null
  @JSName("get properties")
  def properties: js.Object = null
  @JSName("get observers")
  def observers: String = null
}

