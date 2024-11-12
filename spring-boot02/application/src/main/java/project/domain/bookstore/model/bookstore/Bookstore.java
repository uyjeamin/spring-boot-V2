package project.domain.bookstore.model.bookstore;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Bookstore {
    private long id;

    private String title;

    private String content;

}
