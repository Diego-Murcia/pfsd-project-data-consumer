package edu.eci.co

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@SpringBootApplication
class PfsdProjectDataConsumerApplication

fun main(args: Array<String>) {
    runApplication<PfsdProjectDataConsumerApplication>(*args)
}
