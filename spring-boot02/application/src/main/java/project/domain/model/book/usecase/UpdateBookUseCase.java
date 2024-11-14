package project.domain.model.book.usecase;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.domain.model.book.Book;
import project.domain.model.book.dto.request.UpdateBookRequest;
import project.domain.model.book.spi.CommandBookPort;

@Service
@RequiredArgsConstructor
public class UpdateBookUseCase {

    private final CommandBookPort commandBookPort;

    public void updateBook(UpdateBookRequest request) {
        commandBookPort.update(request);
    }

}
