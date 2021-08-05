package com.bootcamp.everis.clientsservice.query.services;

import com.bootcamp.everis.clientsservice.query.projections.models.Business;
import com.bootcamp.everis.clientsservice.query.projections.repositories.BusinessRepository;
import com.bootcamp.everis.clientsservice.query.projections.services.BusinessQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BusinessQueryServiceImpl implements BusinessQueryService {
    @Autowired
    private BusinessRepository businessRepository;

    @Override
    public Flux<Business> findAllBusinessClients() {
        return businessRepository.findAll();
    }

    @Override
    public Mono<Business> findBusinessClientById(String id) {
        return businessRepository.findById(id);
    }
}
