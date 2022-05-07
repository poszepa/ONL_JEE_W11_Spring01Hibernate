package pl.coderslab.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.coderslab.model.Publisher;
import pl.coderslab.repository.PublisherRepository;

import java.util.Optional;

@Slf4j
@RequestMapping("spring-data/publisher")
@RequiredArgsConstructor
@RestController
public class SpringDataPublisherController {

    private final PublisherRepository publisherRepository;



    @GetMapping("/nip/{nip}")
    public String findByNip(@PathVariable("nip") String nip) {
        return publisherRepository.findByNip(nip).toString();
    }

}
