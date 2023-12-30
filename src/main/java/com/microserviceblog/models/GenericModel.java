package com.microserviceblog.models;

import com.microserviceblog.interfaces.IGeneric;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.lang.annotation.Documented;


@AllArgsConstructor
@NoArgsConstructor
@Getter(value = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)
@ToString(callSuper = true)

public abstract class GenericModel implements  Serializable ,IGeneric {
    @Id
    public String id;
}
