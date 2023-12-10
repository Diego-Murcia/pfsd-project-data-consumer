package edu.eci.co.domain

import java.time.LocalDate

data class ManagedOrdersPerDayByStore(
    val date: LocalDate,
    val city: String,
    val storeId: String,
    val storeName: String,
    val orders: Long,
    val ordersArmi: Long,
    val percentage: Double
)
