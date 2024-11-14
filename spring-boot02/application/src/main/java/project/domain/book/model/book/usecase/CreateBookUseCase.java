package project.domain.book.model.book.usecase;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.domain.book.model.book.Book;
import project.domain.book.model.book.dto.request.CreateBookRequest;
import project.domain.book.spi.BookPort;

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
