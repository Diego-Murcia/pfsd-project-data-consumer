package edu.eci.co.application.services

import edu.eci.co.application.ports.`in`.KafkaConsumerService
import edu.eci.co.application.ports.out.PersistenceAdapter
import edu.eci.co.domain.*
import org.springframework.stereotype.Component
import java.lang.IllegalArgumentException
import java.time.LocalDate

@Component
class KafkaConsumerServiceImpl(val persistenceAdapter: PersistenceAdapter): KafkaConsumerService {
    override fun consumeAndSaveInformation(message: String) {
        when {
            message.contains("ManagedOrdersPerDayByCity") -> {
                val model =
                    message
                        .substringAfter("(")
                        .substringBeforeLast(")")
                        .split(",")
                        .takeIf { it.size == 5 }
                        ?.let {
                            ManagedOrdersPerDayByCity(
                                LocalDate.parse(it[0]),
                                it[1],
                                it[2].toLong(),
                                it[3].toLong(),
                                it[4].toDouble()
                            )
                        } ?: throw IllegalArgumentException("Invalid format")

                persistenceAdapter.saveManagedOrdersPerDayByCity(model)
            }

            message.contains("ManagedOrdersPerDayByStore") -> {
                val model =
                    message
                        .substringAfter("(")
                        .substringBeforeLast(")")
                        .split(",")
                        .takeIf { it.size == 7 }
                        ?.let {
                            ManagedOrdersPerDayByStore(
                                LocalDate.parse(it[0]),
                                it[1],
                                it[2],
                                it[3],
                                it[4].toLong(),
                                it[5].toLong(),
                                it[6].toDouble()
                            )
                        } ?: throw IllegalArgumentException("Invalid format")

                persistenceAdapter.saveManagedOrdersPerDayByStore(model)
            }

            message.contains("OrdersPlacedAgainstNoPlacedPerDay") -> {
                val model =
                    message
                        .substringAfter("(")
                        .substringBeforeLast(")")
                        .split(",")
                        .takeIf { it.size == 3 }
                        ?.let {
                            OrdersPlacedAgainstNoPlacedPerDay(
                                LocalDate.parse(it[0]),
                                it[1].toLong(),
                                it[2].toLong()
                            )
                        } ?: throw IllegalArgumentException("Invalid format")

                persistenceAdapter.saveOrdersPlacedAgainstNoPlacedPerDay(model)
            }

            message.contains("OrdersPlacedAgainstNoPlacedPerMonth") -> {
                val model =
                    message
                        .substringAfter("(")
                        .substringBeforeLast(")")
                        .split(",")
                        .takeIf { it.size == 3 }
                        ?.let {
                            OrdersPlacedAgainstNoPlacedPerMonth(
                                it[0],
                                it[1].toLong(),
                                it[2].toLong()
                            )
                        } ?: throw IllegalArgumentException("Invalid format")

                persistenceAdapter.saveOrdersPlacedAgainstNoPlacedPerMonth(model)
            }

            message.contains("OrdersPlacedMetricsPerDay") -> {
                val model =
                    message
                        .substringAfter("(")
                        .substringBeforeLast(")")
                        .split(",")
                        .takeIf { it.size == 3 }
                        ?.let {
                            OrdersPlacedMetricsPerDay(
                                LocalDate.parse(it[0]),
                                it[1].toLong(),
                                it[2].toLong()
                            )
                        } ?: throw IllegalArgumentException("Invalid format")

                persistenceAdapter.saveOrdersPlacedMetricsPerDay(model)
            }

            message.contains("OrdersPlacedMetricsPerMonth") -> {
                val model =
                    message
                        .substringAfter("(")
                        .substringBeforeLast(")")
                        .split(",")
                        .takeIf { it.size == 3 }
                        ?.let {
                            OrdersPlacedMetricsPerMonth(
                                it[0],
                                it[1].toLong(),
                                it[2].toLong()
                            )
                        } ?: throw IllegalArgumentException("Invalid format")

                persistenceAdapter.saveOrdersPlacedMetricsPerMonth(model)
            }
        }
    }

    override fun getSomeMetrics(): List<OrdersPlacedMetricsPerDay> {
        return persistenceAdapter.findAllOrdersPlacedMetricsPerDay()
    }
}