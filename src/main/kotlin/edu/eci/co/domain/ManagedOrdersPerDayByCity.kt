package edu.eci.co.domain

import edu.eci.co.adapters.out.entities.ManagedOrdersPerDayByCityEntity
import java.time.LocalDate

data class ManagedOrdersPerDayByCity(
    val date: LocalDate,
    val city: String,
    val orders: Long,
    val ordersArmi: Long,
    val percentage: Double
)
