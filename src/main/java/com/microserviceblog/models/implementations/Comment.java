package com.microserviceblog.models.implementations;


import com.microserviceblog.models.GenericModel;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "comments")
@AllArgsConstructor
@NoArgsConstructor
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@ToString(callSuper = true)
public class Comment extends GenericModel {

    private String postId ;
    private String content ;
    private Date timestamp ;

}
