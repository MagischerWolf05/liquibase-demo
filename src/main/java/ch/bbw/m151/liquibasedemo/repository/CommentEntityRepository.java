package ch.bbw.m151.liquibasedemo.repository;

import ch.bbw.m151.liquibasedemo.datamodel.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentEntityRepository extends JpaRepository<CommentEntity, Integer> {
}