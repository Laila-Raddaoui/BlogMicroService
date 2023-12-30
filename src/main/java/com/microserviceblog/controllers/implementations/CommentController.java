package  com.microserviceblog.controllers.implementations;

import com.microserviceblog.controllers.GenericController;
import com.microserviceblog.models.implementations.Comment;
import com.microserviceblog.services.implementations.CommentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/comments")
public class CommentController extends GenericController<Comment> {

    public CommentController(CommentService commentService){
        super(commentService);
    }
}
