package singleProject.domain.bookstore.model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    @GetMapping
    public String hello() {
        return "hello";
    }
}
