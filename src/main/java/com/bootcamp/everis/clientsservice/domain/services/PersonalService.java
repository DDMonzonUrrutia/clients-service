package com.bootcamp.everis.clientsservice.domain.services;

import com.bootcamp.everis.clientsservice.domain.models.Personal;
import reactor.core.publisher.Mono;

public interface PersonalService {
    Mono<Personal> createPersonal(Personal personal);
    Mono<Personal> findPersonalById(String id);
}
