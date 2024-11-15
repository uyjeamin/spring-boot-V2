package project.domain.book.persistence.repository;

import org.springframework.data.repository.CrudRepository;
import project.domain.book.persistence.entity.BookEntity;


public interface BookRepository extends CrudRepository<BookEntity,Long> {


}
