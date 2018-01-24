package hu.sevdev.steem_comments.client

import hu.sevdev.polymer
import hu.sevdev.steem_api.{ DomWsTransportModule, ConfigModule, SteemClient }

import scala.scalajs.js
import scala.scalajs.js.annotation.{ JSExportStatic, JSName }

object SteemCommentClient {
  def main(args: Array[String]): Unit = {

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

    object client extends SteemClient with DomWsTransportModule with ConfigModule {
      val config = new Config {
        def baseUrl = "ws://example.com"
      }
    }

    println(client.info)

    polymer.Element.define[SteemComments](SteemComments)
  }
}
