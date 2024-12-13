package project.domain.book.presentation;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import project.domain.book.presentation.dto.CreateBookWebRequest;
import project.domain.book.dto.request.UpdateBookRequest;
import project.domain.book.dto.response.ReadBookResponse;
import project.domain.book.usecase.CreateBookUseCase;
import project.domain.book.usecase.DeleteBookUseCase;
import project.domain.book.usecase.ReadBookUseCase;
import project.domain.book.usecase.UpdateBookUseCase;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookWebAdapter {
    private final CreateBookUseCase createBookUseCase;
    private final ReadBookUseCase readBookUseCase;
    private final UpdateBookUseCase updateBookUseCase;
    private final DeleteBookUseCase deleteBookUseCase;

    @PostMapping("")
    public void createBook(@RequestBody CreateBookWebRequest request) {
        createBookUseCase.createBookstore(request.toDomainRequest());
    }

    @GetMapping("/{id}")
    public ReadBookResponse readBook(@PathVariable Long id) {
        return readBookUseCase.readBook(id);
    }

    @PutMapping("")
    public void updateBook(@RequestBody UpdateBookRequest request){
        updateBookUseCase.updateBook(request);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        deleteBookUseCase.deleteBook(id);
    }
}
