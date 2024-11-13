package project.domain.bookstore.persistence;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import project.domain.bookstore.model.bookstore.Bookstore;
import project.domain.bookstore.spi.BookstorePort;
import project.domain.bookstore.persistence.mapper.BookstoreMapper;
import project.domain.bookstore.persistence.repository.BookstoreRepository;

@Repository
@RequiredArgsConstructor
public class BookstorePersistenceAdapter implements BookstorePort {
    private final BookstoreRepository bookstoreRepository;
    private final BookstoreMapper bookstoreMapper;


    @Override
    public void save(Bookstore bookstore) {
        bookstoreRepository.findById(bookstore.getId()).ifPresent(a ->{throw new RuntimeException("already exists");});
        bookstoreRepository.save(bookstoreMapper.toEntity(bookstore));
    }

    @Override
    public void delete(long id) {
        bookstoreRepository.deleteById(id);
    }

    @Override
    public void update(Bookstore bookstore) {
       bookstoreRepository.findById(bookstore.getId()).orElseThrow(()->new RuntimeException("book not found to update"));
       bookstoreRepository.save(bookstoreMapper.toEntity(bookstore));
    }

    @Override
    public Bookstore get(long id) {
        return bookstoreMapper.toDomain(
                bookstoreRepository.findById(id).orElseThrow(()->new RuntimeException("book not found"))
        );
    }
}
