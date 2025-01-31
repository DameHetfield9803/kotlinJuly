package io.pivotal
import com.sun.net.httpserver.HttpExchange
import com.sun.net.httpserver.HttpHandler
import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress

fun main() {
    val server = HttpServer.create(InetSocketAddress(8000), 0)
    server.createContext("/test", MyHandler())
    server.createContext("/", IndexHandler())
    server.executor = null // creates a default executor
    server.start()
}

class MyHandler : HttpHandler {
    override fun handle(t: HttpExchange) {
        val response = "This is the response"
        t.sendResponseHeaders(200, response.length.toLong())
        val os = t.responseBody
        os.write(response.toByteArray())
        os.close()
    }
}

class IndexHandler : HttpHandler{
  override fun handle(t: HttpExchange){
    val response = "Hello world"
    t.sendResponseHeaders(200, response.length.toLong())
    val os = t.responseBody
    os.write(response.toByteArray())
    os.close()
  }
}
