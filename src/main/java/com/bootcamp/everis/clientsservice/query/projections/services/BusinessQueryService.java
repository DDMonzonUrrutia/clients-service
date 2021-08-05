package com.bootcamp.everis.clientsservice.query.projections.services;

import com.bootcamp.everis.clientsservice.query.projections.models.Business;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BusinessQueryService {
    public Flux<Business> findAllBusinessClients();
    public Mono<Business> findBusinessClientById(String id);
}
