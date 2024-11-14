package project.domain.book.persistence.mapper;


import org.springframework.stereotype.Component;
import project.domain.book.model.book.Book;
import project.domain.book.persistence.entity.BookEntity;

@Component
public class BookMapper {

    public BookEntity toEntity(Book domain){
        return BookEntity.builder()
                .id(domain.getId())
                .title(domain.getTitle())
                .content(domain.getContent())
                .build();
    }

    public Book toDomain(BookEntity entity){
        return Book.builder()
                .id(entity.getId())
                .title(entity.getTitle())
                .content(entity.getContent())
                .build();
    }
}
