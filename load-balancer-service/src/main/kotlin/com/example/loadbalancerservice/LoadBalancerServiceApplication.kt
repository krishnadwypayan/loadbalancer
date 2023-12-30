package com.example.loadbalancerservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LoadBalancerServiceApplication

fun main(args: Array<String>) {
    runApplication<LoadBalancerServiceApplication>(*args)
}
