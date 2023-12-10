package edu.eci.co.adapters.out.entities

import edu.eci.co.domain.OrdersPlacedMetricsPerMonth
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "orders-placed-metrics-per-month")
data class OrdersPlacedMetricsPerMonthEntity(
    @Id val id: String? = null,
    val month: String,
    val ordersArmi: Long,
    val ordersOthers: Long
) {
    object Mapper {
        fun fromModel(model: OrdersPlacedMetricsPerMonth): OrdersPlacedMetricsPerMonthEntity {
            return OrdersPlacedMetricsPerMonthEntity(
                month = model.month,
                ordersArmi = model.ordersArmi,
                ordersOthers = model.ordersOthers
            )
        }
    }
}
