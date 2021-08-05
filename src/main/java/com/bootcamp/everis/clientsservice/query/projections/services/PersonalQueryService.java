package com.bootcamp.everis.clientsservice.query.projections.services;

import com.bootcamp.everis.clientsservice.query.projections.models.Personal;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonalQueryService {
    Mono<Personal> findPersonalById(String id);
    Flux<Personal> findAllPersonals();
}
