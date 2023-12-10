package edu.eci.co.adapters.out.repositories

import edu.eci.co.adapters.out.entities.OrdersPlacedMetricsPerMonthEntity
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface OrdersPlacedMetricsPerMonthRepository: MongoRepository<OrdersPlacedMetricsPerMonthEntity, String> {
}