package project.domain.book.persistence.repository;

import project.domain.book.persistence.entity.BookEntity;
import org.springframework.data.repository.CrudRepository;


public interface BookRepository extends CrudRepository<BookEntity,Long> {


}
