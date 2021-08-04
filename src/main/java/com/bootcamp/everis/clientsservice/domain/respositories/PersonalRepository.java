package com.bootcamp.everis.clientsservice.domain.respositories;

import com.bootcamp.everis.clientsservice.domain.models.Personal;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalRepository extends ReactiveMongoRepository<Personal, String> {
}