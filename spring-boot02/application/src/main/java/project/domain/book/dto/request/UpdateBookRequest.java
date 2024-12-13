package project.domain.book.dto.request;

public record UpdateBookRequest(
        long id,
        String title,
        String content
) {
}
