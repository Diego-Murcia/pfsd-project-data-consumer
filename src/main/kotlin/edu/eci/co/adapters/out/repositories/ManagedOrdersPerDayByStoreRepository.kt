package edu.eci.co.adapters.out.repositories

import edu.eci.co.adapters.out.entities.ManagedOrdersPerDayByStoreEntity
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ManagedOrdersPerDayByStoreRepository: MongoRepository<ManagedOrdersPerDayByStoreEntity, String> {
}