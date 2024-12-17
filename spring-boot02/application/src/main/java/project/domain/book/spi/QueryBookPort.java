package project.domain.book.spi;

import project.domain.book.dto.response.ReadBookResponse;
import project.domain.book.spi.vo.BookVO;

import java.util.List;

public interface QueryBookPort {

    ReadBookResponse get(long id);

    List<BookVO> getAll();
}
