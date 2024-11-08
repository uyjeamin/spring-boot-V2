package infrastructure.domain.persistence.entity;

import jakarta.persistence.*;

@Entity
public class BookstoreEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String title;

    @Column
    private String content;
}
