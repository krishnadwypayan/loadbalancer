package com.example.loadbalancer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LoadbalancerApplication

fun main(args: Array<String>) {
    System.setProperty("java.net.preferIPv6Addresses", "false");

    runApplication<LoadbalancerApplication>(*args)
}
