package project.domain.book.spi;

import project.domain.book.model.Book;
import project.domain.book.dto.request.UpdateBookRequest;

public interface CommandBookPort {

    void save(Book book);

    void delete(long id);

    void update(UpdateBookRequest request);
}
