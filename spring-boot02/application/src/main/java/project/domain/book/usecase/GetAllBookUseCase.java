package project.domain.book.usecase;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.domain.book.dto.response.QueryBookResponse;
import project.domain.book.spi.QueryBookPort;
import project.domain.book.spi.vo.BookVO;

import java.util.List;

@RequiredArgsConstructor
@Service
public class GetAllBookUseCase {
    private final QueryBookPort queryBookPort;

    public QueryBookResponse execute() {
        List<BookVO> result = queryBookPort.getAll();

        return new QueryBookResponse(result);
    }
}
