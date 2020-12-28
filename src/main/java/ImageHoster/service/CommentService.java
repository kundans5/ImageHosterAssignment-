package ImageHoster.service;

import ImageHoster.model.Comment;
import ImageHoster.model.Image;
import ImageHoster.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public void addComment(Comment comment) {
        comment.setCreatedDate(new Date());
        commentRepository.addComment(comment);
    }
}