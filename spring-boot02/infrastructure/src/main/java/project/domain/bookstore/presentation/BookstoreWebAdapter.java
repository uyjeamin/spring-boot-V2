package project.domain.bookstore.presentation;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.domain.bookstore.model.bookstore.usecase.CreateBookstoreUseCase;
import project.domain.bookstore.presentation.dto.CreateBookWebRequest;

@RestController
@RequestMapping("/bookstore")
@RequiredArgsConstructor
public class BookstoreWebAdapter {
    private final CreateBookstoreUseCase createBookstoreUseCase;

    @PostMapping("")
    public void CreateBook(@RequestBody CreateBookWebRequest request) {
        createBookstoreUseCase.createBookstore(request.toDomainRequest());
    }


}
