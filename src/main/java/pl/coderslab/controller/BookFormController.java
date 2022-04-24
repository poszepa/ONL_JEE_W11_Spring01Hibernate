package pl.coderslab.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.dao.BookDao;
import pl.coderslab.dao.PublisherDao;
import pl.coderslab.model.Book;
import pl.coderslab.model.Publisher;

import java.util.List;

@Controller
@RequestMapping("bookForm")
@RequiredArgsConstructor
public class BookFormController {

    private final BookDao bookDao;
    private final PublisherDao publisherDao;

    @GetMapping("add")
    public String addNewBook(Model model) {
        model.addAttribute("book", new Book());
        return "bookForm-add";
    }

    @PostMapping("add")
    @ResponseBody
    public String saveNewBook(@ModelAttribute("book") Book book) {
        bookDao.saveBook(book);

        return "OK";
    }

    @ModelAttribute("publishers")
    public List<Publisher> getAllPublishers() {
        return publisherDao.findAll();
    }
}
