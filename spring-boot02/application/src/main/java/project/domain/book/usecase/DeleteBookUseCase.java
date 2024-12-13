package project.domain.book.usecase;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.domain.book.spi.CommandBookPort;

@Service
@RequiredArgsConstructor
public class DeleteBookUseCase {
    private final CommandBookPort commandBookPort;

    public void deleteBook(long id){
        commandBookPort.delete(id);
    }

}
