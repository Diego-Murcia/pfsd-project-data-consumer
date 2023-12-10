package edu.eci.co.adapters.out

import edu.eci.co.application.ports.`in`.KafkaConsumerService
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class DataProcessedConsumer(val kafkaConsumerService: KafkaConsumerService) {
    @KafkaListener(topics = ["data-processed-topic"], groupId = "data-consumer-group-01")
    fun listen(message: String) {
        kafkaConsumerService.consumeAndSaveInformation(message)
    }
}