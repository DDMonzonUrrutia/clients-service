package com.bootcamp.everis.clientsservice.command.domain.services;

import com.bootcamp.everis.clientsservice.query.projections.models.Business;
import reactor.core.publisher.Mono;

public interface BusinessCommandService {
    Mono<Business> createBusinessClient(Business business);
    Mono<Business> updateBusinessClient(String id, Business business);
    Mono<Void> deleteBusinessClient(String id);
}
