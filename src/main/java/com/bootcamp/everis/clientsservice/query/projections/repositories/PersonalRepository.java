package com.bootcamp.everis.clientsservice.query.projections.repositories;

import com.bootcamp.everis.clientsservice.query.projections.models.Personal;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalRepository extends ReactiveMongoRepository<Personal, String> {
}
