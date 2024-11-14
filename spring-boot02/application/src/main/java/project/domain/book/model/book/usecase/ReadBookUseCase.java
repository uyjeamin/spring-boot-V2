package project.domain.book.model.book.usecase;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.domain.book.model.book.Book;
import project.domain.book.spi.CommandBookPort;
import project.domain.book.spi.QueryBookPort;

@Service
@RequiredArgsConstructor
public class ReadBookUseCase {
    private final QueryBookPort queryBookPort;

    public Book getBook(long id) {
        return queryBookPort.get(id);
    }
}
