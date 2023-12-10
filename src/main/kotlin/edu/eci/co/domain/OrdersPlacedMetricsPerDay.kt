package edu.eci.co.domain

import edu.eci.co.adapters.out.entities.OrdersPlacedMetricsPerDayEntity
import java.time.LocalDate

data class OrdersPlacedMetricsPerDay(
    val date: LocalDate,
    val ordersArmi: Long,
    val ordersOthers: Long
) {
    object Mapper {
        fun fromEntity(entity: OrdersPlacedMetricsPerDayEntity): OrdersPlacedMetricsPerDay {
            return OrdersPlacedMetricsPerDay(
                entity.date,
                entity.ordersArmi,
                entity.ordersOthers
            )
        }
    }
}
