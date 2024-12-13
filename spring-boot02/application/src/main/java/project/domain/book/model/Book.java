package project.domain.book.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Book {
    private long id;

    private String title;

    private String content;

    private String author;

    private BookType type;
}
