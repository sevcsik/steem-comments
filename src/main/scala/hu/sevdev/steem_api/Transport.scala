package hu.sevdev.steem_api

trait TransportModule {
  trait Transport {
    val name: String
  }

  def transport: Transport
}
