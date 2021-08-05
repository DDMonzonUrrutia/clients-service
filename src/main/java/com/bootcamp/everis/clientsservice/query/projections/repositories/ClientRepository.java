package com.bootcamp.everis.clientsservice.query.projections.repositories;

import com.bootcamp.everis.clientsservice.query.projections.models.Client;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends ReactiveMongoRepository<Client, String> {
}
