package project.domain.book.spi;

import project.domain.book.model.book.Book;

public interface CommandBookPort {

    void save(Book book);

    void delete(long id);

    void update(Book book);
}
