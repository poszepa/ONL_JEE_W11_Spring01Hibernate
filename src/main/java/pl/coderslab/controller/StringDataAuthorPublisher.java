package pl.coderslab.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.coderslab.model.Author;
import pl.coderslab.repository.AuthorRepository;

@Slf4j
@RestController
@RequiredArgsConstructor
public class StringDataAuthorPublisher {

    private final AuthorRepository authorRepository;

    @GetMapping("test/{email}")
    public void testingMethod(@PathVariable("email") String email) {
        Author author = authorRepository.findByEmail(email);
        log.info("{}", author.getEmail());
    }
}
