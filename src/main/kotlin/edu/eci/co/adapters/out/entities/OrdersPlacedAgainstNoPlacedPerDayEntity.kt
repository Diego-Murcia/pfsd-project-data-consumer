package edu.eci.co.adapters.out.entities

import edu.eci.co.domain.OrdersPlacedAgainstNoPlacedPerDay
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDate

@Document(collection = "orders-placed-against-no-placed-per-day")
data class OrdersPlacedAgainstNoPlacedPerDayEntity(
    @Id val id: String? = null,
    val date: LocalDate,
    val ordersPlaced: Long,
    val ordersNoPlaced: Long
) {
    object Mapper {
        fun fromModel(model: OrdersPlacedAgainstNoPlacedPerDay): OrdersPlacedAgainstNoPlacedPerDayEntity {
            return OrdersPlacedAgainstNoPlacedPerDayEntity(
                date = model.date,
                ordersPlaced = model.ordersPlaced,
                ordersNoPlaced = model.ordersNoPlaced
            )
        }
    }
}
