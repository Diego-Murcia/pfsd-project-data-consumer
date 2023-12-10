package edu.eci.co.adapters.out.entities

import edu.eci.co.domain.ManagedOrdersPerDayByCity
import edu.eci.co.domain.ManagedOrdersPerDayByStore
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDate

@Document(collection = "managed-orders-per-day-by-store")
data class ManagedOrdersPerDayByStoreEntity(
    @Id val id: String? = null,
    val date: LocalDate,
    val city: String,
    val storeId: String,
    val storeName: String,
    val orders: Long,
    val ordersArmi: Long,
    val percentage: Double
) {
    object Mapper {
        fun fromModel(model: ManagedOrdersPerDayByStore): ManagedOrdersPerDayByStoreEntity {
            return ManagedOrdersPerDayByStoreEntity(
                date = model.date,
                city = model.city,
                storeId = model.storeId,
                storeName = model.storeName,
                orders = model.orders,
                ordersArmi = model.ordersArmi,
                percentage = model.percentage
            )
        }
    }
}
