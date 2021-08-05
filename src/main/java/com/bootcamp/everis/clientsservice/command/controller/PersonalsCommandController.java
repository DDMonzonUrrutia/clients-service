package com.bootcamp.everis.clientsservice.command.controller;

import com.bootcamp.everis.clientsservice.command.domain.services.PersonalCommandService;
import com.bootcamp.everis.clientsservice.command.dto.PersonalRequestDto;
import com.bootcamp.everis.clientsservice.query.projections.models.Personal;
import com.bootcamp.everis.clientsservice.shared.dto.PersonalResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/clients")
public class PersonalsCommandController {

    @Autowired
    private PersonalCommandService personalCommandService;

    @PostMapping("/personals")
    public Mono<PersonalResponseDto> createPersonal(@RequestBody PersonalRequestDto request) {
        Personal personal = PersonalRequestDto.personalRequestDtoToEntity(request);
        return personalCommandService.createPersonal(personal)
                .map(PersonalResponseDto::personalEntityToPersonalResponseDto)
                .switchIfEmpty(Mono.error(new Exception("Error while create a personal client")));
    }

    @PutMapping("/personals")
    public Mono<PersonalResponseDto> updatePersonalById(@RequestParam String personalId, @RequestBody PersonalRequestDto request) {
        Personal personal = PersonalRequestDto.personalRequestDtoToEntity(request);
        return personalCommandService.updatePersonal(personal, personalId)
                .map(PersonalResponseDto::personalEntityToPersonalResponseDto);
    }

    @DeleteMapping("/personals")
    public Mono<Void> deletePersonal(@RequestParam String personalId) {
        return personalCommandService.deletePersonal(personalId);
    }

}
