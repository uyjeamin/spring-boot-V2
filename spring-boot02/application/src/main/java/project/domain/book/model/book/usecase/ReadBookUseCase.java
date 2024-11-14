package project.domain.book.model.book.usecase;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.domain.book.model.book.Book;
import project.domain.book.spi.CommandBookPort;

@Service
@RequiredArgsConstructor
public class ReadBookUseCase {
    private final CommandBookPort commandBookPort;

    public Book getBook() {

    }
}
