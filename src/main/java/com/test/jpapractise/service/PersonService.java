package com.test.jpapractise.service;

import com.test.jpapractise.entity.Person;
import com.test.jpapractise.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository personRepository;

    public Person create(Person person) {
        Person person1 = personRepository.save(person);
        return person1;
    }

    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    public List<Person> findPersonByLastnameFirstname(String lastname, String firstname) {
        List<Person> person = personRepository.findByLastnameOrFirstname(lastname, firstname);
        System.out.println(person);
        return person;
    }
}
