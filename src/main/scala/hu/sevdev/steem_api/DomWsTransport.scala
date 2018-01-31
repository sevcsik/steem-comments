package hu.sevdev.steem_api

import java.io.IOException
import rxscalajs.{ Observable, Subject }
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{ Future, Promise }
import org.scalajs.dom.{ Event, MessageEvent, WebSocket }

trait DomWsTransportModule extends TransportModule {
  this: ConfigModule =>

  lazy val transport = new Transport {
    val name = "DOM WebSocket"
    val connection: Future[WebSocket] = {
      val p: Promise[WebSocket] = Promise()
      val ws: WebSocket = new WebSocket(config.baseUrl)

      ws.onopen = _ => p.success(ws)
      ws.onerror = (e: Event) => p.failure(new Error(s"Failed to open WebSocket: ${e.toString}"))
      ws.onmessage = (e: MessageEvent) => messagesSubject.next(e.data.toString())

      p.future
    }
    private val messagesSubject = Subject[String]()
    val messages: Observable[String] = messagesSubject.map(x => x)
    def send(json: String): Future[Unit] = connection.map(ws => ws.send(json))
  }
}
