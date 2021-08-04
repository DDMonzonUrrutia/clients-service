package com.bootcamp.everis.clientsservice.domain.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Document(collection = "client")
@TypeAlias("business")
@Getter
@Setter
public class Business {
    private String socialReason;
    private String ruc;
    private Set<String> credits;
    private Set<String> currentAccounts;
}
