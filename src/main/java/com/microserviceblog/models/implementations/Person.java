package com.microserviceblog.models.implementations;

import com.microserviceblog.models.GenericModel;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "persons")
@AllArgsConstructor
@NoArgsConstructor
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@ToString(callSuper = true)
public class Person extends GenericModel{

    private String firstName;
    private String lastName;
    private String email;
}
