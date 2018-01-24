package hu.sevdev.steem_api

trait DomWsTransportModule extends TransportModule {
  lazy val transport = new Transport {
    val name = "DOM WebSocket Transport"
  }
}
