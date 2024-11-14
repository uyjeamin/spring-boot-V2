package project.domain.book.model.book.dto.request;

public record CreateBookRequest(
        String title,
        String content
) {
}
