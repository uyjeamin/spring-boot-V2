package project.domain.bookstore.presentation.dto;

import lombok.Builder;
import lombok.Getter;
import project.domain.bookstore.model.bookstore.dto.request.CreateBookRequest;

@Getter
@Builder
public class CreateBookWebRequest {

    private String title;

    private String content;

    public CreateBookRequest toDomainRequest() {
        return new CreateBookRequest(title, content);
    }
}
