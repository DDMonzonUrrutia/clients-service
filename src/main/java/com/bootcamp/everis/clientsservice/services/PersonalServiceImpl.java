package com.bootcamp.everis.clientsservice.services;

import com.bootcamp.everis.clientsservice.domain.models.Personal;
import com.bootcamp.everis.clientsservice.domain.respositories.PersonalRepository;
import com.bootcamp.everis.clientsservice.domain.services.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Service
public class PersonalServiceImpl implements PersonalService {

    @Autowired
    private PersonalRepository personalRepository;

    @Override
    public Mono<Personal> createPersonal(Personal personal) {
        String personalId = UUID.randomUUID().toString();
        personal.setId(personalId);
        personal.setCredit(null);
        return personalRepository.save(personal);
    }

    @Override
    public Mono<Personal> findPersonalById(String id) {
        return personalRepository.findById(id);
    }
}
