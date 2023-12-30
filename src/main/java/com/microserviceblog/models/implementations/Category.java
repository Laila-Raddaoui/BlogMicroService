package com.microserviceblog.models.implementations;
import com.microserviceblog.interfaces.IGeneric;
import com.microserviceblog.models.GenericModel;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "categories")
@NoArgsConstructor
@AllArgsConstructor
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@ToString(callSuper = true)

public class Category extends GenericModel {

    private  String categoryName;
}
