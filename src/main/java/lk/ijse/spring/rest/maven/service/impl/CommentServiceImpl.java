package lk.ijse.spring.rest.maven.service.impl;

import lk.ijse.spring.rest.maven.dto.CommentDTO;
import lk.ijse.spring.rest.maven.entity.Comments;
import lk.ijse.spring.rest.maven.repository.CommentRepository;
import lk.ijse.spring.rest.maven.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public ArrayList<CommentDTO> getAllComments() {
        return null;
    }

    @Override
    public CommentDTO getComment(int commentId) {
        return null;
    }

    @Override
    public boolean deleteComment(int commentId) {
        return false;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean saveComment(CommentDTO commentDTO) {
        System.out.println("aaaaaaaaaaaaaaaaaaaaaa");
        Comments comment = new Comments(commentDTO.getFullName(),
                commentDTO.getContact(),
                commentDTO.getEmail(),
                commentDTO.getMessage());
        commentRepository.save(comment);
        System.out.println(comment);
        return true;
    }
}