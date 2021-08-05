package com.bootcamp.everis.clientsservice.command.controller;

import com.bootcamp.everis.clientsservice.command.domain.services.BusinessCommandService;
import com.bootcamp.everis.clientsservice.command.dto.BusinessRequestDto;
import com.bootcamp.everis.clientsservice.query.projections.models.Business;
import com.bootcamp.everis.clientsservice.shared.dto.BusinessResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/clients")
public class BusinessCommandController {
    @Autowired
    private BusinessCommandService businessCommandService;

    @PostMapping("/businesses")
    public Mono<BusinessResponseDto> createBusinessClient(@RequestBody BusinessRequestDto requestDto) {
        Business business = BusinessRequestDto.requestDtoToEntity(requestDto);
        return businessCommandService.createBusinessClient(business)
                .map(BusinessResponseDto::entityToResponse)
                .switchIfEmpty(Mono.error(new Exception("Error while create a business client")));
    }

    @PutMapping("/businesses")
    public Mono<BusinessResponseDto> updateBusiness(@RequestParam String businessId,
                                                    @RequestBody BusinessRequestDto businessRequestDto) {
        Business business = BusinessRequestDto.requestDtoToEntity(businessRequestDto);
        return businessCommandService.updateBusinessClient(businessId, business)
                .map(BusinessResponseDto::entityToResponse);
    }

    @DeleteMapping("/businesses")
    public Mono<Void> deleteBusiness(@RequestParam String businessId) {
        return businessCommandService.deleteBusinessClient(businessId);
    }

}
