package project.domain.book.usecase;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.domain.book.model.Book;
import project.domain.book.dto.request.CreateBookRequest;
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
