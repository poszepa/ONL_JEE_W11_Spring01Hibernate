package pl.coderslab.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.model.Publisher;

@Slf4j
@Controller
@RequestMapping("publishers")
public class PublisherExampleController {

    // http://localhost:8080/publishers/example?publisher=1
    @GetMapping("example")
    @ResponseBody
    public String getPublisher(@RequestParam Publisher publisher) {
        log.info("{}", publisher.getName());
        return publisher.getName();
    }
}
