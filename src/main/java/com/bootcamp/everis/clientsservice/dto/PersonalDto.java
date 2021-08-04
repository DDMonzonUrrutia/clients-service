package com.bootcamp.everis.clientsservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PersonalDto extends ClientDto{
    private String firstname;
    private String lastname;
    private String doi;

    public PersonalDto(String phone, String firstname, String lastname, String doi) {
        super(phone);
        this.firstname = firstname;
        this.lastname = lastname;
        this.doi = doi;
    }
}
