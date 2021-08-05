package com.bootcamp.everis.clientsservice.query.projections.repositories;

import com.bootcamp.everis.clientsservice.query.projections.models.Business;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessRepository extends ReactiveMongoRepository<Business, String> {
}
