package com.demo.dubbozkconsumer

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@EnableDubbo
@SpringBootApplication
class DubboZkConsumerApplication

fun main(args: Array<String>) {
    runApplication<DubboZkConsumerApplication>(*args)
}
