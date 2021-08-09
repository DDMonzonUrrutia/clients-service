package com.bootcamp.everis.clientsservice.shared.dto;

import com.bootcamp.everis.clientsservice.query.projections.models.Personal;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
public class PersonalResponseDto extends ClientResponseDto {
    private String firstname;
    private String lastname;
    private String doi;


    static public PersonalResponseDto personalEntityToPersonalResponseDto(Personal personal) {
        PersonalResponseDto personalDto = new PersonalResponseDto();
        personalDto.setId(personal.getId());
        personalDto.setFirstname(personal.getFirstname());
        personalDto.setDoi(personal.getDoi());
        personalDto.setPhone(personal.getPhone());
        personalDto.setLastname(personal.getLastname());
        personalDto.setClientType(personalDto.getClientType());
        return personalDto;

    }

}
