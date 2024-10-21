package com.test.jpapractise.controller;

import com.test.jpapractise.service.PersonService;
import com.test.jpapractise.entity.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {
    private final PersonService personService;

    @PostMapping("/create")
    public Person createPerson(@RequestBody Person person) {
        return personService.create(person);
    }

    @GetMapping("/all-persons")
    public List<Person> getAllPersons() {
        return personService.getAllPersons();

    }

    @GetMapping("/find-by-lastname-or-firstname")
    public List<Person> findPersonByLastnameFirstname(@RequestParam String lastname,@RequestParam String firstname) {
        return personService.findPersonByLastnameFirstname(lastname,firstname);
    }
}
