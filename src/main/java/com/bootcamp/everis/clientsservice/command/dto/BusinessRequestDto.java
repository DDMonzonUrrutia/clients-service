package com.bootcamp.everis.clientsservice.command.dto;

import com.bootcamp.everis.clientsservice.query.projections.models.Business;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BusinessRequestDto extends ClientRequestDto{
    private String socialReason;
    private String ruc;

    static public Business requestDtoToEntity(BusinessRequestDto request) {
        Business business = new Business();
        business.setPhone(request.getPhone());
        business.setRuc(request.getRuc());
        business.setSocialReason(request.getSocialReason());
        return business;
    }
}
