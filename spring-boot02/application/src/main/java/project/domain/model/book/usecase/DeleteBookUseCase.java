package project.domain.model.book.usecase;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.domain.model.book.spi.CommandBookPort;

@Service
@RequiredArgsConstructor
public class DeleteBookUseCase {
    private final CommandBookPort commandBookPort;

    public void deleteBook(long id){
        commandBookPort.delete(id);
    }

}
