package com.bootcamp.everis.clientsservice.query.projections.models;

import com.mongodb.lang.Nullable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotNull;

@Setter
@Getter
@NoArgsConstructor
@Document(collection = "client")
public class Personal extends Client{
    private String firstname;
    private String lastname;
    @Indexed(unique = true)
    private String doi;
    @Nullable
    @Field
    private String credit = null;
    @Field
    @Nullable
    private String account = null;
}
