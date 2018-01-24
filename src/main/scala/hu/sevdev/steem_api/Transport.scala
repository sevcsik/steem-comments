package hu.sevdev.steem_api

trait TransportComponent {
  def transport: Transport

  trait Transport {
    val info: String
  }
}
