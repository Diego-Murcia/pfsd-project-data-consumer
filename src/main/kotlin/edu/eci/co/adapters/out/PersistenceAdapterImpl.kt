package edu.eci.co.adapters.out

import edu.eci.co.adapters.out.entities.*
import edu.eci.co.adapters.out.repositories.*
import edu.eci.co.application.ports.out.PersistenceAdapter
import edu.eci.co.domain.*
import org.springframework.stereotype.Component

@Component
class PersistenceAdapterImpl(
    val managedOrdersPerDayByCityRepository: ManagedOrdersPerDayByCityRepository,
    val managedOrdersPerDayByStoreRepository: ManagedOrdersPerDayByStoreRepository,
    val ordersPlacedAgainstNoPlacedPerDayRepository: OrdersPlacedAgainstNoPlacedPerDayRepository,
    val ordersPlacedAgainstNoPlacedPerMonthRepository: OrdersPlacedAgainstNoPlacedPerMonthRepository,
    val ordersPlacedMetricsPerDayRepository: OrdersPlacedMetricsPerDayRepository,
    val ordersPlacedMetricsPerMonthRepository: OrdersPlacedMetricsPerMonthRepository
): PersistenceAdapter {
    override fun saveManagedOrdersPerDayByCity(model: ManagedOrdersPerDayByCity) {
        managedOrdersPerDayByCityRepository.save(ManagedOrdersPerDayByCityEntity.Mapper.fromModel(model))
    }

    override fun saveManagedOrdersPerDayByStore(model: ManagedOrdersPerDayByStore) {
        managedOrdersPerDayByStoreRepository.save(ManagedOrdersPerDayByStoreEntity.Mapper.fromModel(model))
    }

    override fun saveOrdersPlacedAgainstNoPlacedPerDay(model: OrdersPlacedAgainstNoPlacedPerDay) {
        ordersPlacedAgainstNoPlacedPerDayRepository.save(OrdersPlacedAgainstNoPlacedPerDayEntity.Mapper.fromModel(model))
    }

    override fun saveOrdersPlacedAgainstNoPlacedPerMonth(model: OrdersPlacedAgainstNoPlacedPerMonth) {
        ordersPlacedAgainstNoPlacedPerMonthRepository.save(OrdersPlacedAgainstNoPlacedPerMonthEntity.Mapper.fromModel(model))
    }

    override fun saveOrdersPlacedMetricsPerDay(model: OrdersPlacedMetricsPerDay) {
        ordersPlacedMetricsPerDayRepository.save(OrdersPlacedMetricsPerDayEntity.Mapper.fromModel(model))
    }

    override fun saveOrdersPlacedMetricsPerMonth(model: OrdersPlacedMetricsPerMonth) {
        ordersPlacedMetricsPerMonthRepository.save(OrdersPlacedMetricsPerMonthEntity.Mapper.fromModel(model))
    }

    override fun findAllOrdersPlacedMetricsPerDay(): List<OrdersPlacedMetricsPerDay> {
        return ordersPlacedMetricsPerDayRepository.findAll().map { OrdersPlacedMetricsPerDay.Mapper.fromEntity(it) }
    }
}