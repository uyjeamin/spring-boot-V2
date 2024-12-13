package project.domain.book.dto.request;

public record CreateBookRequest(
        String title,
        String content
) {
}
