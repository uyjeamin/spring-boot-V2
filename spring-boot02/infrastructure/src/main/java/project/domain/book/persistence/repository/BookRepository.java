package project.domain.book.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import project.domain.book.persistence.entity.BookEntity;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long> {


}
