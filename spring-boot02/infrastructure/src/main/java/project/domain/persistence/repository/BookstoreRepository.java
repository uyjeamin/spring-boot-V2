package project.domain.persistence.repository;

import project.domain.persistence.entity.BookstoreEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookstoreRepository extends CrudRepository<BookstoreEntity,Long> {


}
