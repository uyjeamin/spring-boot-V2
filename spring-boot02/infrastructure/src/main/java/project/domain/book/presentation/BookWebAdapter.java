package project.domain.book.presentation;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import project.domain.book.model.book.Book;
import project.domain.book.model.book.usecase.CreateBookUseCase;
import project.domain.book.model.book.usecase.ReadBookUseCase;
import project.domain.book.presentation.dto.CreateBookWebRequest;

@RestController
@RequestMapping("/bookstore")
@RequiredArgsConstructor
public class BookWebAdapter {
    private final CreateBookUseCase createBookUseCase;
    private final ReadBookUseCase readBookUseCase;

    @PostMapping("")
    public void CreateBook(@RequestBody CreateBookWebRequest request) {
        createBookUseCase.createBookstore(request.toDomainRequest());
    }

    @GetMapping("{id}")
    public Book ReadBook(@RequestParam("id") Long id) {
        return readBookUseCase.getBook(id);
    }


}
