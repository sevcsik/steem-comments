package hu.sevdev.steem_comments

import hu.sevdev.polymer.Element
import hu.sevdev.steem_api.{ DomWsTransportModule, ConfigModule, SteemClient }

import scala.scalajs.js.annotation.{ JSExportStatic, JSName }

object Setup {
  def main(args: Array[String]): Unit = {
    object client extends SteemClient with DomWsTransportModule with ConfigModule {
      val config = new Config {
        def baseUrl = "wss://gtg.steem.house:8090"
      }
    }

    SteemCommentsComponent.setClient(client)

    Element.define[SteemCommentsComponent](SteemCommentsComponent)
  }
}
