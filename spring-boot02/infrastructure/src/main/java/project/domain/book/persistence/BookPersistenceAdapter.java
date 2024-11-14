package project.domain.book.persistence;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import project.domain.book.model.book.Book;
import project.domain.book.spi.BookPort;
import project.domain.book.persistence.mapper.BookMapper;
import project.domain.book.persistence.repository.BookRepository;

@Repository
@RequiredArgsConstructor
public class BookPersistenceAdapter implements BookPort {
    private final BookRepository bookstoreRepository;
    private final BookMapper bookstoreMapper;


    @Override
    public void save(Book bookstore) {
        bookstoreRepository.findById(bookstore.getId()).ifPresent(a ->{throw new RuntimeException("already exists");});
        bookstoreRepository.save(bookstoreMapper.toEntity(bookstore));
    }

    @Override
    public void delete(long id) {
        bookstoreRepository.deleteById(id);
    }

    @Override
    public void update(Book bookstore) {
       bookstoreRepository.findById(bookstore.getId()).orElseThrow(()->new RuntimeException("book not found to update"));
       bookstoreRepository.save(bookstoreMapper.toEntity(bookstore));
    }

    @Override
    public Book get(long id) {
        return bookstoreMapper.toDomain(
                bookstoreRepository.findById(id).orElseThrow(()->new RuntimeException("book not found"))
        );
    }
}
