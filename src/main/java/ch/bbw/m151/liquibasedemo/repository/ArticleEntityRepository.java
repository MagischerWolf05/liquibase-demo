package ch.bbw.m151.liquibasedemo.repository;

import ch.bbw.m151.liquibasedemo.datamodel.ArticleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ArticleEntityRepository extends JpaRepository<ArticleEntity, UUID> {
}