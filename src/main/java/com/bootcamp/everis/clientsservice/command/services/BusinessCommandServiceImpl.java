package com.bootcamp.everis.clientsservice.command.services;

import com.bootcamp.everis.clientsservice.command.domain.services.BusinessCommandService;
import com.bootcamp.everis.clientsservice.query.projections.models.Business;
import com.bootcamp.everis.clientsservice.query.projections.repositories.BusinessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class BusinessCommandServiceImpl implements BusinessCommandService {

    @Autowired
    private BusinessRepository businessRepository;

    @Override
    public Mono<Business> createBusinessClient(Business business) {
        return businessRepository.save(business);
    }

    @Override
    public Mono<Business> updateBusinessClient(String id, Business business) {
        return businessRepository.findById(id)
                .map(b -> {
                    b.setRuc(business.getRuc());
                    b.setPhone(business.getPhone());
                    b.setSocialReason(business.getSocialReason());
                    return b;
                })
                .flatMap(businessRepository::save)
                .switchIfEmpty(Mono.error(new Exception("Business Client Not founded")));
    }

    @Override
    public Mono<Void> deleteBusinessClient(String id) {
        return businessRepository.findById(id)
                .switchIfEmpty(Mono.error(new Exception("Business Client Not Founded")))
                .flatMap(businessRepository::delete);
    }
}
