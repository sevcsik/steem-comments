package hu.sevdev.steem_api

trait SteemClient {
  this: TransportModule with ConfigModule =>
  def info = s"Steem Client with ${transport.name} transport and with base URL ${config.baseUrl}"
}
