package project.domain.model.book.usecase;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.domain.model.book.Book;
import project.domain.model.book.dto.response.ReadBookResponse;
import project.domain.model.book.spi.QueryBookPort;

@Service
@RequiredArgsConstructor
public class ReadBookUseCase {
    private final QueryBookPort queryBookPort;

    public ReadBookResponse readBook(long id) {
        return queryBookPort.get(id);
    }
}
