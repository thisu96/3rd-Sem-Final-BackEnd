package lk.ijse.spring.rest.maven.service;

import lk.ijse.spring.rest.maven.dto.CommentDTO;

import java.util.ArrayList;

public interface CommentService {

    public ArrayList<CommentDTO> getAllComments();

    public CommentDTO getComment(int commentId);

    public boolean deleteComment(int commentId);

    public boolean saveComment(CommentDTO commentDTO);

}
