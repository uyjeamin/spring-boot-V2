package project.domain.model.book.dto.request;

public record CreateBookRequest(
        String title,
        String content
) {
}
