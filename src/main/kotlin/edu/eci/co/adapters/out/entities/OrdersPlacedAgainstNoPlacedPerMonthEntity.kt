package edu.eci.co.adapters.out.entities

import edu.eci.co.domain.OrdersPlacedAgainstNoPlacedPerMonth
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document


@Document(collection = "orders-placed-against-no-placed-per-month")
data class OrdersPlacedAgainstNoPlacedPerMonthEntity(
    @Id val id: String? = null,
    val month: String,
    val ordersPlaced: Long,
    val ordersNoPlaced: Long
) {
    object Mapper {
        fun fromModel(model: OrdersPlacedAgainstNoPlacedPerMonth): OrdersPlacedAgainstNoPlacedPerMonthEntity {
            return OrdersPlacedAgainstNoPlacedPerMonthEntity(
                month = model.month,
                ordersPlaced = model.ordersPlaced,
                ordersNoPlaced = model.ordersNoPlaced
            )
        }
    }
}
