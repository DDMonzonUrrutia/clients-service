package com.bootcamp.everis.clientsservice.shared.dto;

import com.bootcamp.everis.clientsservice.query.projections.models.Business;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
public class BusinessResponseDto extends ClientResponseDto{
    private String socialReason;
    private String ruc;

    static public BusinessResponseDto entityToResponse(Business business) {
        BusinessResponseDto businessResponseDto = new BusinessResponseDto();
        businessResponseDto.setId(business.getId());
        businessResponseDto.setPhone(business.getPhone());
        businessResponseDto.setRuc(business.getRuc());
        businessResponseDto.setSocialReason(business.getSocialReason());
        return businessResponseDto;
    }
}
