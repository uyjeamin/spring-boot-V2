package com.example.infrastructure.domain.persistence.repository;

import com.example.infrastructure.domain.persistence.entity.BookstoreEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookstoreRepository extends CrudRepository<BookstoreEntity,Long> {


}
