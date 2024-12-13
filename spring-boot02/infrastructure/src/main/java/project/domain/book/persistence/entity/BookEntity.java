package project.domain.book.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import project.domain.book.model.BookType;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String title;

    @Column
    private String content;

    @Column
    private String author;

    @Column
    @Enumerated(EnumType.STRING)
    private BookType type;
}
