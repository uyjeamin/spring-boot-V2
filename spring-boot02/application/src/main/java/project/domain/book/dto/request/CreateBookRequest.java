package project.domain.book.dto.request;

import project.domain.book.model.BookType;

public record CreateBookRequest(
        String title,
        String content,
        String author,
        BookType type
) {
}
