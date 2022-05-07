package pl.coderslab.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.dao.AuthorDao;
import pl.coderslab.dao.BookDao;
import pl.coderslab.dao.PublisherDao;
import pl.coderslab.model.Book;
import pl.coderslab.model.Publisher;

import javax.validation.Valid;

@RequiredArgsConstructor
@Slf4j
@Controller
@RequestMapping("publishers")
public class PublisherExampleController {


    private final PublisherDao publisherDao;

    @GetMapping("add")
    public String addNewBook(Model model) {
        model.addAttribute("publisher", new Publisher());
        return "publisher/publisherForm-add";
    }

    @PostMapping("add")
    public String saveNewBook(@ModelAttribute("publisher") @Valid Publisher publisher, BindingResult result) {
        if(result.hasErrors()) {
            return "publisher/publisherForm-add";
        }

        publisherDao.save(publisher);
        return "redirect:/publisher/publishersForm-all";
    }

    @GetMapping("all")
    public String showAllPublishers(Model model) {
        model.addAttribute("publishers", publisherDao.findAll());
        return "publisher/publishersForm-all";
    }

    // localhost:8080/bookForm/edit/2
    @GetMapping("edit/{id}")
    public String editPublisher(@PathVariable("id") long id,
                           Model model) {
        Publisher publisher = publisherDao.findById(id);
        model.addAttribute("publisher", publisher);
        return "publisher/publisherForm-edit";
    }

    @PostMapping("edit")
    public String modifyPublisher(@ModelAttribute("publisher")@Valid Publisher publisher, BindingResult result) {
        if(result.hasErrors()) {
            return "redirect: edit/" + publisher.getId();
        }
        publisherDao.update(publisher);
        return "redirect: all";
    }
}
