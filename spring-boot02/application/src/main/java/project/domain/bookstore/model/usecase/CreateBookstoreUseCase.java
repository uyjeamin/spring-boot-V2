package project.domain.bookstore.model.usecase;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.domain.bookstore.model.bookstore.Bookstore;
import project.domain.bookstore.spi.BookstorePort;
import project.domain.bookstore.spi.CommandBookstorePort;

import java.awt.print.Book;

@Service
@RequiredArgsConstructor
public class CreateBookstoreUseCase {
   private final BookstorePort bookstorePort;

   public void createBookstore(Bookstore bookstore) {
      bookstorePort.save(bookstore);
   }


   }
