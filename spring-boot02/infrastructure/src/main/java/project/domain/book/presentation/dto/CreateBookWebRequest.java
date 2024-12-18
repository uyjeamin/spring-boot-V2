package project.domain.book.presentation.dto;

import lombok.Builder;
import lombok.Getter;
import project.domain.model.book.dto.request.CreateBookRequest;

@Getter
@Builder
public class CreateBookWebRequest {

    private String title;

    private String content;

    public CreateBookRequest toDomainRequest() {
        return new CreateBookRequest(title, content);
    }
}
