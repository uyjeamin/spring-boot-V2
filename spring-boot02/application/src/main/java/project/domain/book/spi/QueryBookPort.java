package project.domain.book.spi;

import project.domain.book.model.book.Book;

public interface QueryBookPort {

    Book get(long id);
}
