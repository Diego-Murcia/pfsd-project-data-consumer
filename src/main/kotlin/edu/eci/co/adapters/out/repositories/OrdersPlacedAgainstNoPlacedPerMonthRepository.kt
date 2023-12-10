package edu.eci.co.adapters.out.repositories

import edu.eci.co.adapters.out.entities.OrdersPlacedAgainstNoPlacedPerMonthEntity
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface OrdersPlacedAgainstNoPlacedPerMonthRepository: MongoRepository<OrdersPlacedAgainstNoPlacedPerMonthEntity, String> {
}