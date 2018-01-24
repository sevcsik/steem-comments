package hu.sevdev.steem_api

trait DomWsTransportComponent extends TransportComponent {
  val baseUrl: String

  def transport = new DomWSTransport

  class DomWSTransport extends Transport {
    val info: String = s"Using DOM WS Transport with base URL $baseUrl"
  }
}
