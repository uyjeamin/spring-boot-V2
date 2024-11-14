package project.domain.model.book.spi;

import project.domain.model.book.Book;
import project.domain.model.book.dto.response.ReadBookResponse;

public interface QueryBookPort {

    ReadBookResponse get(long id);
}
