package com.bootcamp.everis.clientsservice.command.services;

import com.bootcamp.everis.clientsservice.command.domain.services.PersonalCommandService;
import com.bootcamp.everis.clientsservice.query.projections.models.Personal;
import com.bootcamp.everis.clientsservice.query.projections.repositories.PersonalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Service
public class PersonalCommandServiceImpl implements PersonalCommandService {
    @Autowired
    private PersonalRepository personalRepository;

    @Override
    public Mono<Personal> createPersonal(Personal personal) {
        return personalRepository.save(personal);
    }

    @Override
    public Mono<Personal> updatePersonal(Personal personal, String id) {
        return personalRepository.findById(id)
                .map(p -> {
                    p.setFirstname(personal.getFirstname());
                    p.setLastname(personal.getLastname());
                    p.setDoi(personal.getDoi());
                    p.setAccount(personal.getAccount());
                    return p;
                })
                .flatMap(personalRepository::save)
                .switchIfEmpty(Mono.error(new Exception("Personal Client not founded")));
    }

    @Override
    public Mono<Void> deletePersonal(String id) {
        return personalRepository.findById(id)
                .switchIfEmpty(Mono.error(new Exception("Personal Client not found")))
                .flatMap(personalRepository::delete);
    }


}
