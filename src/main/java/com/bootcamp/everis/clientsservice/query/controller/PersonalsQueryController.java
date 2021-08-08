package com.bootcamp.everis.clientsservice.query.controller;

import com.bootcamp.everis.clientsservice.query.projections.models.Personal;
import com.bootcamp.everis.clientsservice.shared.dto.PersonalResponseDto;
import com.bootcamp.everis.clientsservice.query.projections.services.PersonalQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/clients")
public class PersonalsQueryController {

    @Autowired
    private PersonalQueryService personalQueryService;

    @GetMapping("/personals/{personalId}")
    public Mono<PersonalResponseDto> getPersonalById(@PathVariable(name = "personalId") String personalId) {
        return personalQueryService.findPersonalById(personalId)
                .map(PersonalResponseDto::personalEntityToPersonalResponseDto)
                .onErrorResume(e -> Mono.error(new RuntimeException("Personal Client Not Founded")));
    }
    @GetMapping("/personals")
    public Flux<PersonalResponseDto> getAllPersonals() {
        return personalQueryService.findAllPersonals().mapNotNull(PersonalResponseDto::personalEntityToPersonalResponseDto);
    }

}
