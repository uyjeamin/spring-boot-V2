package project.domain.model.book.spi;

import project.domain.model.book.Book;
import project.domain.model.book.dto.request.UpdateBookRequest;

public interface CommandBookPort {

    void save(Book book);

    void delete(long id);

    void update(UpdateBookRequest request);
}
