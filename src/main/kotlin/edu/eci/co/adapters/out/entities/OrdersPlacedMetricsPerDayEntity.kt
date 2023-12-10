package edu.eci.co.adapters.out.entities

import edu.eci.co.domain.OrdersPlacedMetricsPerDay
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDate

@Document(collection = "orders-placed-metrics-per-day")
data class OrdersPlacedMetricsPerDayEntity(
    @Id val id: String? = null,
    val date: LocalDate,
    val ordersArmi: Long,
    val ordersOthers: Long
) {
    object Mapper {
        fun fromModel(model: OrdersPlacedMetricsPerDay): OrdersPlacedMetricsPerDayEntity {
            return OrdersPlacedMetricsPerDayEntity(
                date = model.date,
                ordersArmi = model.ordersArmi,
                ordersOthers = model.ordersOthers
            )
        }
    }
}
