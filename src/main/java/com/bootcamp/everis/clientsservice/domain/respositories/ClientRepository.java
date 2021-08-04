package com.bootcamp.everis.clientsservice.domain.respositories;

import com.bootcamp.everis.clientsservice.domain.models.Client;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends ReactiveMongoRepository<Client, String> {
}
