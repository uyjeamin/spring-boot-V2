package project.domain.persistence.mapper;


import org.springframework.stereotype.Component;
import project.domain.bookstore.model.bookstore.Bookstore;
import project.domain.persistence.entity.BookstoreEntity;

@Component
public class BookstoreMapper {

    public BookstoreEntity toEntity(Bookstore domain){
        return BookstoreEntity.builder()
                .id(domain.getId())
                .title(domain.getTitle())
                .content(domain.getContent())
                .build();
    }

    public Bookstore toDomain(BookstoreEntity entity){
        return Bookstore.builder()
                .id(entity.getId())
                .title(entity.getTitle())
                .content(entity.getContent())
                .build();
    }
}
