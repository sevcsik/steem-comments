package hu.sevdev.steem_api

import scala.concurrent.Future

trait TransportModule {
  trait Transport {
    val name: String
    def send(json: String): Future[Unit]
  }

  def transport: Transport
}
