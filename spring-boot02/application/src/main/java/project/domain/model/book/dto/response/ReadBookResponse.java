package project.domain.model.book.dto.response;

import lombok.Builder;

@Builder
public class ReadBookResponse {
    private long id;

    private String title;

    private String content;
}
