package com.microserviceblog.models.implementations;


import com.microserviceblog.models.GenericModel;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "posts")
@AllArgsConstructor
@NoArgsConstructor
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@ToString(callSuper = true)
public class Post extends GenericModel {

    private String title;
    private String content;
    private String userId;
    private List<Category> categories;
    private List<Comment> comments;

}
