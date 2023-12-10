package edu.eci.co.application.ports.`in`

import edu.eci.co.domain.OrdersPlacedMetricsPerDay

interface KafkaConsumerService {
    fun consumeAndSaveInformation(message: String)
    fun getSomeMetrics(): List<OrdersPlacedMetricsPerDay>
}