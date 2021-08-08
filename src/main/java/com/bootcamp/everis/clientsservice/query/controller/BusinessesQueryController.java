package com.bootcamp.everis.clientsservice.query.controller;

import com.bootcamp.everis.clientsservice.query.projections.services.BusinessQueryService;
import com.bootcamp.everis.clientsservice.shared.dto.BusinessResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/clients")
public class BusinessesQueryController {
    @Autowired
    private BusinessQueryService businessQueryService;

    @GetMapping("/businesses")
    public Flux<BusinessResponseDto> getAllBusinesses() {
        return businessQueryService.findAllBusinessClients().map(BusinessResponseDto::entityToResponse).onErrorResume(e -> Mono.error(new Exception("Business Client Not Founded")));
    }

    @GetMapping("/businesses/{businessId}")
    public Mono<BusinessResponseDto> getBusinessById(@PathVariable String businessId) {
        return businessQueryService.findBusinessClientById(businessId).map(BusinessResponseDto::entityToResponse);
    }
}
