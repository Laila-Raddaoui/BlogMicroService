package com.microserviceblog.services.implementations;

import com.microserviceblog.models.implementations.Comment;
import com.microserviceblog.repositories.implementations.CommentRepository;
import com.microserviceblog.services.GenericService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CommentService extends GenericService<Comment> {
    public CommentService(CommentRepository commentRepository) {
        super(commentRepository);
    }
}
