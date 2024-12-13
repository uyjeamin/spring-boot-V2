package project.domain.book.spi;

import project.domain.book.dto.response.ReadBookResponse;

public interface QueryBookPort {

    ReadBookResponse get(long id);
}
