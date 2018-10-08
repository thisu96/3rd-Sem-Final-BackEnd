package lk.ijse.spring.rest.maven.controller;

import lk.ijse.spring.rest.maven.dto.CommentDTO;
import lk.ijse.spring.rest.maven.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/v1/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveComment(@RequestBody CommentDTO commentDTO) {
        return commentService.saveComment(commentDTO);
    }

}
