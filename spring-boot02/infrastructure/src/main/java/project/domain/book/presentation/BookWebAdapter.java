package project.domain.book.presentation;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import project.domain.book.presentation.dto.CreateBookWebRequest;
import project.domain.model.book.Book;
import project.domain.model.book.dto.request.UpdateBookRequest;
import project.domain.model.book.dto.response.ReadBookResponse;
import project.domain.model.book.usecase.CreateBookUseCase;
import project.domain.model.book.usecase.ReadBookUseCase;
import project.domain.model.book.usecase.UpdateBookUseCase;

@RestController
@RequestMapping("/bookstore")
@RequiredArgsConstructor
public class BookWebAdapter {
    private final CreateBookUseCase createBookUseCase;
    private final ReadBookUseCase readBookUseCase;
    private final UpdateBookUseCase updateBookUseCase;

    @PostMapping("")
    public void createBook(@RequestBody CreateBookWebRequest request) {
        createBookUseCase.createBookstore(request.toDomainRequest());
    }

    @GetMapping("{id}")
    public ReadBookResponse readBook(@RequestParam("id") Long id) {
        return readBookUseCase.readBook(id);
    }

    @PutMapping("")
    public void updateBook(@RequestBody UpdateBookRequest request){
        updateBookUseCase.updateBook(request);
    }


}
