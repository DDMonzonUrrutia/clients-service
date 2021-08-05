package com.bootcamp.everis.clientsservice.command.domain.services;

import com.bootcamp.everis.clientsservice.query.projections.models.Personal;
import reactor.core.publisher.Mono;

public interface PersonalCommandService {
    Mono<Personal> createPersonal(Personal personal);
    Mono<Personal> updatePersonal(Personal personal, String id);
    Mono<Void> deletePersonal(String id);
}
