package project.domain.model.book.dto.request;

public record UpdateBookRequest(
        long id,
        String title,
        String content
) {
}
