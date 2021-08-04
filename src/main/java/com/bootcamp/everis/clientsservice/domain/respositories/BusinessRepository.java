package com.bootcamp.everis.clientsservice.domain.respositories;

import com.bootcamp.everis.clientsservice.domain.models.Business;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessRepository extends ReactiveMongoRepository<Business, String> {
}
