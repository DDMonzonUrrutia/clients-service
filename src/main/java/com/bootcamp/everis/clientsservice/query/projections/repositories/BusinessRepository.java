package com.bootcamp.everis.clientsservice.query.projections.repositories;

import com.bootcamp.everis.clientsservice.query.projections.models.Business;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface BusinessRepository extends ReactiveMongoRepository<Business, String> {
    Flux<Business> findAllByClientType(String clientType);
}
