package project.domain.bookstore.model.bookstore.dto.request;

public record CreateBookRequest(
        String title,
        String content
) {
}
