package com.microserviceblog.services.implementations;

import com.microserviceblog.models.implementations.Post;
import com.microserviceblog.repositories.implementations.PostRepository;
import com.microserviceblog.services.GenericService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PostService extends GenericService<Post> {

    public PostService(PostRepository postRepository){
        super(postRepository);
    }
}
