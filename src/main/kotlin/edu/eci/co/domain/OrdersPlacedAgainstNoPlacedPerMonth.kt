package edu.eci.co.domain

data class OrdersPlacedAgainstNoPlacedPerMonth(
    val month: String,
    val ordersPlaced: Long,
    val ordersNoPlaced: Long
)
