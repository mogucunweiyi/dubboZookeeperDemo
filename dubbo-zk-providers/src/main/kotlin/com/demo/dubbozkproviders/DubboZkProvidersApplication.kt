package com.demo.dubbozkproviders

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@EnableDubbo
@SpringBootApplication
class DubboZkProvidersApplication

fun main(args: Array<String>) {
    runApplication<DubboZkProvidersApplication>(*args)
}
