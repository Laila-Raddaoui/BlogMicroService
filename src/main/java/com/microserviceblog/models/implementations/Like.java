package com.microserviceblog.models.implementations;

import com.microserviceblog.models.GenericModel;
import lombok.*;
import org.apache.catalina.User;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "likes")
@AllArgsConstructor
@NoArgsConstructor
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@ToString(callSuper = true)
public class Like extends GenericModel {

    private Post postId;
    private Person userId;
}
