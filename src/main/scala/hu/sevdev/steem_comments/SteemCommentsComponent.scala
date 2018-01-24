package hu.sevdev.steem_comments

import hu.sevdev.polymer.{ Element, ElementCompanion }
import hu.sevdev.steem_api.SteemClient

import scala.scalajs.js.annotation.{ JSExportStatic }

class SteemCommentsComponent extends Element {
  override def connectedCallback(): Unit = {
    super.connectedCallback
    println("Connected with client" ++ SteemCommentsComponent.client.info)
  }
}

object SteemCommentsComponent extends ElementCompanion {
  @JSExportStatic
  def is: String = "steem-comments"
  @JSExportStatic
  override def template: String = "Hello, world!"

  def setClient(client: SteemClient): Unit = {
    if (this.client != null) {
      throw new IllegalStateException("Client can be set only once")
    } else {
      this.client = client
    }
  }

  private var client: SteemClient = null
}

