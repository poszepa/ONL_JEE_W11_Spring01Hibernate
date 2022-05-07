package pl.coderslab.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.coderslab.model.Book;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;

@Slf4j
@Controller
@RequiredArgsConstructor
public class ValidationController {

    private final Validator validator;

    @GetMapping("validate")
    public String validateObject(Model model) {
        Book book = new Book(); // tworzymy nowy obiekt typu Book (pusty, wiec nie przejdzie walidacji)

        Set<ConstraintViolation<Book>> result = validator.validate(book); // odpalamy walidację
        if (!result.isEmpty()) {  // sprawdzamy, czy są jakieś błędy
            for (ConstraintViolation<Book> violation : result) {  // wyświetlamy te błędy
                log.warn("{} -> {}", violation.getPropertyPath(), violation.getMessage());
            }
        }
        model.addAttribute("errors", result);

        return "validate";
    }
}
