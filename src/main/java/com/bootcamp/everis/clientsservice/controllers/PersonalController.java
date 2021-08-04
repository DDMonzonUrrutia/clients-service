package com.bootcamp.everis.clientsservice.controllers;

import com.bootcamp.everis.clientsservice.domain.models.Personal;
import com.bootcamp.everis.clientsservice.domain.services.PersonalService;
import com.bootcamp.everis.clientsservice.dto.PersonalDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/clients")
public class PersonalController {
    @Autowired
    private PersonalService personalService;

    @PostMapping
    public Mono<Personal> createPersonal(@RequestBody PersonalDto personalDto) {
        Personal personal = new Personal();
        personal.setFirstname(personalDto.getFirstname());
        personal.setLastname(personalDto.getLastname());
        personal.setPhone(personalDto.getPhone());
        personal.setDoi(personalDto.getDoi());
        return personalService.createPersonal(personal);
    }

    @GetMapping
    public Mono<PersonalDto> getPersonalById(@RequestParam(name = "personal-id") String personalId) {
        return personalService.findPersonalById(personalId).mapNotNull(personal -> {
            PersonalDto personalDto = new PersonalDto();
            personalDto.setFirstname(personal.getFirstname());
            personalDto.setDoi(personal.getDoi());
            personalDto.setPhone(personal.getPhone());
            personalDto.setLastname(personal.getLastname());
            return personalDto;
        });
    }
}
