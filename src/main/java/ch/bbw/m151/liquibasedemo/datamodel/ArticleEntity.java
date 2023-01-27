package ch.bbw.m151.liquibasedemo.datamodel;
import java.sql.Timestamp;
import java.util.UUID;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "articles")
public class ArticleEntity {
    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid")
    private UUID id;
    @Column(nullable = false)
    String title;
    @Column
    String text;

    @Column(name = "createdTs", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp createdTs;

    @Column(nullable = false)
    private int version;
}
