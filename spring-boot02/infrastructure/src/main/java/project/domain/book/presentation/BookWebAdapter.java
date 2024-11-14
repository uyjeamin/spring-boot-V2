package project.domain.book.presentation;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.domain.book.model.book.usecase.CreateBookstoreUseCase;
import project.domain.book.presentation.dto.CreateBookWebRequest;

@RestController
@RequestMapping("/bookstore")
@RequiredArgsConstructor
public class BookWebAdapter {
    private final CreateBookstoreUseCase createBookstoreUseCase;

    @PostMapping("")
    public void CreateBook(@RequestBody CreateBookWebRequest request) {
        createBookstoreUseCase.createBookstore(request.toDomainRequest());
    }


}
