package project.domain.book.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
public class Book {
    private long id;

    private String title;

    private String content;

    private String author;

    private BookType type;
}
