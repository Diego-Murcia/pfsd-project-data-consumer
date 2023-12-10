package edu.eci.co.adapters.out.repositories

import edu.eci.co.adapters.out.entities.OrdersPlacedMetricsPerDayEntity
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface OrdersPlacedMetricsPerDayRepository: MongoRepository<OrdersPlacedMetricsPerDayEntity, String> {
}