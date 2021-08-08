package com.bootcamp.everis.clientsservice.query.projections.repositories;

import com.bootcamp.everis.clientsservice.query.projections.models.Personal;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface PersonalRepository extends ReactiveMongoRepository<Personal, String> {
    Flux<Personal> findAllByClientType(String clientType);
}
