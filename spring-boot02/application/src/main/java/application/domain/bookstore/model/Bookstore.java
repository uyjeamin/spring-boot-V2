package application.domain.bookstore.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Bookstore {
    private long id;

    private String title;

    private String content;

}
