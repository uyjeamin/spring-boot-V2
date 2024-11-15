package project.domain.model.book;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Book {
    private long id;

    private String title;

    private String content;

}
