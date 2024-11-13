package project.domain.bookstore.model.bookstore.usecase;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.domain.bookstore.model.bookstore.Bookstore;
import project.domain.bookstore.model.bookstore.dto.request.CreateBookRequest;
import project.domain.bookstore.spi.BookstorePort;
import project.domain.bookstore.spi.CommandBookstorePort;

import java.awt.print.Book;

@Service
@RequiredArgsConstructor
public class CreateBookstoreUseCase {
   private final BookstorePort bookstorePort;


   public void createBookstore(CreateBookRequest request) {
      Bookstore bookstore = Bookstore.builder()
              .title(request.title())
              .content(request.content())
              .build();
      bookstorePort.save(bookstore);
   }
   }
