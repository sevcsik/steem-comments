package hu.sevdev.steem_comments.client

import hu.sevdev.polymer

import scala.scalajs.js
import scala.scalajs.js.annotation.{ JSExportStatic, JSName }

class SteemComments extends polymer.Element {
  override def connectedCallback(): Unit = {
    super.connectedCallback
    println("Connected")
  }
}

object SteemComments extends polymer.ElementCompanion {
  @JSExportStatic
  def is: String = "steem-comments"
  @JSExportStatic
  override def template: String = "Hello, world!"
}

object SteemCommentClient {
  def main(args: Array[String]): Unit = {
    polymer.Element.define[SteemComments](SteemComments)
  }
}
