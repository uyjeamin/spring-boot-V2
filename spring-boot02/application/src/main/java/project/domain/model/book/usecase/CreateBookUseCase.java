package project.domain.model.book.usecase;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.domain.model.book.Book;
import project.domain.model.book.dto.request.CreateBookRequest;
import project.domain.model.book.spi.BookPort;

@Service
@RequiredArgsConstructor
public class CreateBookUseCase {
   private final BookPort bookPort;


   public void createBookstore(CreateBookRequest request) {
      Book book = Book.builder()
              .title(request.title())
              .content(request.content())
              .build();
      bookPort.save(book);
   }
   }
