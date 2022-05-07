package pl.coderslab.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.coderslab.model.Book;
import pl.coderslab.repository.BookRepository;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("spring-data/book")
public class SpringDAtaBookController {

    private final BookRepository bookRepository;

    @GetMapping("all")
    public void findAll() {
        List<Book> all = bookRepository.findAll();
        all.forEach(book -> log.info("{}", book.getId()));
    }

    @GetMapping("findByTitle")
    public void findByTitle(){
        List<Book> all = bookRepository.findBookByTitle("wqeqwrq");
        all.forEach(book -> log.info("{}", book.toString()));
    }
}
