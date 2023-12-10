package edu.eci.co.domain

data class OrdersPlacedMetricsPerMonth(
    val month: String,
    val ordersArmi: Long,
    val ordersOthers: Long
)
