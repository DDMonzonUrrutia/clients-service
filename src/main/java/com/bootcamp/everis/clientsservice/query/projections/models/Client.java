package com.bootcamp.everis.clientsservice.query.projections.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Client {
    @Id
    private String id;
    private String phone;
}
