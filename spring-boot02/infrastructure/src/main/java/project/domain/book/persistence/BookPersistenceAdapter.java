package project.domain.book.persistence;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import static project.domain.book.persistence.entity.QBookEntity.bookEntity; // static 으로 import 해서 bookEntity 가져오기

import project.domain.book.persistence.entity.BookEntity;
import project.domain.book.persistence.mapper.BookMapper;
import project.domain.book.persistence.repository.BookRepository;
import project.domain.book.model.Book;
import project.domain.book.dto.request.UpdateBookRequest;
import project.domain.book.dto.response.ReadBookResponse;
import project.domain.book.persistence.repository.vo.QQueryBookVO;
import project.domain.book.spi.BookPort;
import project.domain.book.persistence.repository.vo.QueryBookVO;
import project.domain.book.spi.vo.BookVO;




import java.util.List;

@Repository
@RequiredArgsConstructor
public class BookPersistenceAdapter implements BookPort {
    private final BookRepository bookRepository;
    private final BookMapper bookstoreMapper;
    private final JPAQueryFactory queryFactory;

    //QBookEntity bookEntity = QBookEntity.bookEntity;



    @Override
    public void save(Book book) {
        bookRepository.findById(book.getId()).ifPresent(a ->{throw new RuntimeException("already exists");});
        bookRepository.save(bookstoreMapper.toEntity(book));
    }

    @Override
    public void delete(long id) {
        bookRepository.deleteById(id);
    }

    @Transactional
    @Override
    public void update(UpdateBookRequest request) {
       bookRepository.findById(request.id()).orElseThrow(()->new RuntimeException("book not found to update"));
       Book book = Book.builder()
               .id(request.id())
               .title(request.title())
               .content(request.content())
               .author(request.author())
               .type(request.type())
               .build();
       bookRepository.save(bookstoreMapper.toEntity(book));
    }

    @Override
    public ReadBookResponse get(long id) {
        Book book= bookstoreMapper.toDomain(
                bookRepository.findById(id).orElseThrow(()->new RuntimeException("book not found"))
        );

       return ReadBookResponse.builder()
                .title(book.getTitle())
                .content(book.getContent())
                .id(book.getId())
                .author(book.getAuthor())
                .type(book.getType())
                .build();
    }


    @Override
    public List<BookVO> getAll() {
                return queryFactory
                        .select(
                                new QQueryBookVO( // bookEntity 테이블에서 필요한 필드만 가져옴
                                        bookEntity.title,
                                        bookEntity.content,
                                        bookEntity.author,
                                        bookEntity.type
                                )
                        )
                        .from(bookEntity)
                        .orderBy(bookEntity.title.asc())
                        .fetch()
                        .stream()
                        .map(BookVO.class::cast) // QueryBookVO -> BookVO 로 변환
                        .toList();
                                            //.selectFrom()  해당 엔티티에서 모든 컬럼 조회

      //  return null;
    }
}
