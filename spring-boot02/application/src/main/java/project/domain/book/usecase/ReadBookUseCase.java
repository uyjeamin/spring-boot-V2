package project.domain.book.usecase;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.domain.book.dto.response.ReadBookResponse;
import project.domain.book.spi.QueryBookPort;

@Service
@RequiredArgsConstructor
public class ReadBookUseCase {
    private final QueryBookPort queryBookPort;

    public ReadBookResponse readBook(long id) {
        return queryBookPort.get(id);
    }
}
