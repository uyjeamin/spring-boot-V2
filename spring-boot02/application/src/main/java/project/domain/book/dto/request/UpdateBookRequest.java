package project.domain.book.dto.request;

import project.domain.book.model.BookType;

public record UpdateBookRequest(
        long id,
        String title,
        String content,
        String author,
        BookType type
) {
}
