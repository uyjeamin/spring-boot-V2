package project.domain.book.persistence;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import project.domain.book.persistence.mapper.BookMapper;
import project.domain.book.persistence.repository.BookRepository;
import project.domain.book.model.Book;
import project.domain.book.dto.request.UpdateBookRequest;
import project.domain.book.dto.response.ReadBookResponse;
import project.domain.book.spi.BookPort;

@Repository
@RequiredArgsConstructor
public class BookPersistenceAdapter implements BookPort {
    private final BookRepository bookRepository;
    private final BookMapper bookstoreMapper;


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
}
