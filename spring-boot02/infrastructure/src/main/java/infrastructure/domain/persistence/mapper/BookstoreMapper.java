package infrastructure.domain.persistence.mapper;

import application.domain.bookstore.model.Bookstore;
import infrastructure.domain.persistence.entity.BookstoreEntity;
import org.springframework.stereotype.Component;

@Component
public class BookstoreMapper {

    public BookstoreEntity toEntity(Bookstore bookstore){
        return BookstoreEntity
    }
}
