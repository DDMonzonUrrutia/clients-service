package com.bootcamp.everis.clientsservice.command.dto;

import com.bootcamp.everis.clientsservice.query.projections.models.Personal;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
public class PersonalRequestDto extends ClientRequestDto{
    private String firstname;
    private String lastname;
    private String doi;

    static public Personal personalRequestDtoToEntity(PersonalRequestDto personalRequestDto) {
        Personal personal = new Personal();
        personal.setFirstname(personalRequestDto.getFirstname());
        personal.setLastname(personalRequestDto.getLastname());
        personal.setPhone(personalRequestDto.getPhone());
        personal.setDoi(personalRequestDto.getDoi());
        return personal;
    }
}
