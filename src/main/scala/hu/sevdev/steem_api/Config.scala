package hu.sevdev.steem_api

trait ConfigModule {
  trait Config {
    def baseUrl: String
  }

  def config: Config
}
