package project.domain.bookstore.persistence.repository;

import project.domain.bookstore.persistence.entity.BookstoreEntity;
import org.springframework.data.repository.CrudRepository;


public interface BookstoreRepository extends CrudRepository<BookstoreEntity,Long> {


}
