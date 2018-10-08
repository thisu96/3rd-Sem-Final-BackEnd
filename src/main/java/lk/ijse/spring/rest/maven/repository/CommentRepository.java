package lk.ijse.spring.rest.maven.repository;

import lk.ijse.spring.rest.maven.entity.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comments, Integer> {
}
