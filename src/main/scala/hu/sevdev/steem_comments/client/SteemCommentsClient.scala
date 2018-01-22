package hu.sevdev.steem_comments.client

import hu.sevdev.polymer

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.annotation.JSExportStatic

@ScalaJSDefined
class SteemComments extends polymer.Element

object SteemComments extends polymer.ElementDefinition {
  @JSExportStatic
  val is: String = "steem-comments"
  @JSExportStatic
  override val template: String = "Hello, world!"
  @JSExportStatic
  override val properties: js.Object = null
  @JSExportStatic
  override val observers: String = null
}

object SteemCommentClient {
  def main(args: Array[String]): Unit = {
    polymer.customElements.define("steem-comments", js.constructorTag[SteemComments].constructor)
  }
}
