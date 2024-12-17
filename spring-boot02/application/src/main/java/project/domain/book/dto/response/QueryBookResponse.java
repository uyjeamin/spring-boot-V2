package project.domain.book.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import project.domain.book.spi.vo.BookVO;

import java.util.List;

@AllArgsConstructor
@Getter
public class QueryBookResponse {
    private final List<BookVO> response;
}
