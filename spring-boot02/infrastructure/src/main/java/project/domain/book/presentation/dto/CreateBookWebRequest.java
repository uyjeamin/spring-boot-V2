package project.domain.book.presentation.dto;

import lombok.Builder;
import lombok.Getter;
import project.domain.book.dto.request.CreateBookRequest;
import project.domain.book.model.BookType;

@Getter
@Builder
public class CreateBookWebRequest {

    private String title;

    private String content;

    private String author;

    private BookType type;

    public CreateBookRequest toDomainRequest() {
        return new CreateBookRequest(title, content,author,type);
    }
}
