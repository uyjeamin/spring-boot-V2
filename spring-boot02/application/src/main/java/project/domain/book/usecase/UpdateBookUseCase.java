package project.domain.book.usecase;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.domain.book.dto.request.UpdateBookRequest;
import project.domain.book.spi.CommandBookPort;

@Service
@RequiredArgsConstructor
public class UpdateBookUseCase {

    private final CommandBookPort commandBookPort;

    public void updateBook(UpdateBookRequest request) {
        commandBookPort.update(request);
    }

}
