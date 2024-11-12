package project.domain.bookstore.spi;

import project.domain.bookstore.model.bookstore.Bookstore;

public interface CommandBookstorePort {

    void save(Bookstore bookstore);

    void delete(long id);

    void update(Bookstore bookstore);
}
