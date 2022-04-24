package pl.coderslab.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.model.Person;

@Slf4j
@Controller
public class PersonController {

    @GetMapping("person")
    public String personForm() {
        return "personForm";
    }

    @PostMapping("person")
    @ResponseBody
    public String handlePersonForm(@RequestParam("login") String login,
                                   @RequestParam("email") String email,
                                   @RequestParam("password") String password) {
        Person person = new Person();
        person.setEmail(email);
        person.setPassword(password);
        person.setLogin(login);
        log.info("New person {}", person);
        // save to DB -> dodanie PersonDao i uzycie metody save()
        return "OK";
    }
}
