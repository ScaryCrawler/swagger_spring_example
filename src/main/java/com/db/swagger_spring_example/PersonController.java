package com.db.swagger_spring_example;

import dao.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/person")
    public Person getPerson() {
        return Person.builder().name("Tester").age(66).build();
    }

    @PostMapping("/person")
    public Person addPerson(@RequestBody Person person) {
        return person;
    }
}
