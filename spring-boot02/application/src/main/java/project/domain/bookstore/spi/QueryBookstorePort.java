package project.domain.bookstore.spi;

import project.domain.bookstore.model.bookstore.Bookstore;

public interface QueryBookstorePort {

    Bookstore get(long id);
}
