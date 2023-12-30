package com.microserviceblog.controllers.implementations;

import com.microserviceblog.controllers.GenericController;
import com.microserviceblog.models.implementations.Post;
import com.microserviceblog.services.implementations.PostService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/posts")
public class PostController extends GenericController<Post> {

    public PostController(PostService postService){
        super(postService);
    }
}
