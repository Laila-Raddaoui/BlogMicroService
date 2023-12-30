package com.microserviceblog.controllers.implementations;

import com.microserviceblog.controllers.GenericController;
import com.microserviceblog.models.implementations.Like;
import com.microserviceblog.services.implementations.LikeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/likes")

public class LikeController extends GenericController<Like> {
    public LikeController(LikeService likeService){
        super(likeService);
    }
}
