package com.microserviceblog.services.implementations;

import com.microserviceblog.models.implementations.Like;
import com.microserviceblog.repositories.implementations.LikeRepository;
import com.microserviceblog.services.GenericService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LikeService extends GenericService<Like> {

    public LikeService(LikeRepository likeRepository){
        super(likeRepository);
    }
}
