package com.bootcamp.everis.clientsservice.query.services;

import com.bootcamp.everis.clientsservice.query.projections.models.Personal;
import com.bootcamp.everis.clientsservice.query.projections.repositories.PersonalRepository;
import com.bootcamp.everis.clientsservice.query.projections.services.PersonalQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PersonalQueryServiceImpl implements PersonalQueryService {
    @Autowired
    private PersonalRepository personalRepository;

    @Override
    public Mono<Personal> findPersonalById(String id) {
        return personalRepository.findById(id);
    }

    @Override
    public Flux<Personal> findAllPersonals() {
        return personalRepository.findAll();
    }
}
