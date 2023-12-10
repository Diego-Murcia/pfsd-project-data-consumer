package edu.eci.co.application.ports.out

import edu.eci.co.domain.*

interface PersistenceAdapter {
    fun saveManagedOrdersPerDayByCity(model: ManagedOrdersPerDayByCity)
    fun saveManagedOrdersPerDayByStore(model: ManagedOrdersPerDayByStore)
    fun saveOrdersPlacedAgainstNoPlacedPerDay(model: OrdersPlacedAgainstNoPlacedPerDay)
    fun saveOrdersPlacedAgainstNoPlacedPerMonth(model: OrdersPlacedAgainstNoPlacedPerMonth)
    fun saveOrdersPlacedMetricsPerDay(model: OrdersPlacedMetricsPerDay)
    fun saveOrdersPlacedMetricsPerMonth(model: OrdersPlacedMetricsPerMonth)
    fun findAllOrdersPlacedMetricsPerDay(): List<OrdersPlacedMetricsPerDay>
}