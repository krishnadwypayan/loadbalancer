package com.example.backendservice

import org.springframework.http.server.reactive.ServerHttpRequest
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


private const val ZEROS_IPV6 = "0:0:0:0:0:0:0:1"
private const val LOCALHOST_IPV4 = "127.0.0.1"

@RestController
class BackendController {

    @GetMapping("/")
    fun greet(serverRequest: ServerHttpRequest): String {
        val host = if (serverRequest.remoteAddress?.address?.hostAddress == ZEROS_IPV6) LOCALHOST_IPV4 else serverRequest.remoteAddress?.address?.hostAddress
        val greeting = "Received request from $host"
        val methodAndPath = "${serverRequest.method} ${serverRequest.path} HTTP/1.1"

        val sb = StringBuilder()
        serverRequest.headers.forEach { entry ->
            sb.append("${entry.key}: ${entry.value}\n")
        }

        return "$greeting\n$methodAndPath\n$sb\n\nHello from backend server"
    }


}