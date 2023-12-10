package edu.eci.co.adapters.out.entities

import edu.eci.co.domain.ManagedOrdersPerDayByCity
import lombok.Data
import lombok.Generated
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDate

@Document(collection = "managed-orders-per-day-by-city")
data class ManagedOrdersPerDayByCityEntity(
    @Id val id: String? = null,
    val date: LocalDate,
    val city: String,
    val orders: Long,
    val ordersArmi: Long,
    val percentage: Double
) {
    object Mapper {
        fun fromModel(model: ManagedOrdersPerDayByCity): ManagedOrdersPerDayByCityEntity {
            return ManagedOrdersPerDayByCityEntity(
                date = model.date,
                city = model.city,
                orders = model.orders,
                ordersArmi = model.ordersArmi,
                percentage = model.percentage
            )
        }
    }
}
