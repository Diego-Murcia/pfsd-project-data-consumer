package edu.eci.co.domain

import java.time.LocalDate

data class OrdersPlacedAgainstNoPlacedPerDay(
    val date: LocalDate,
    val ordersPlaced: Long,
    val ordersNoPlaced: Long
)
