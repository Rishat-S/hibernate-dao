package ru.netology.hibernatedemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.hibernatedemo.entity.Person;
import ru.netology.hibernatedemo.service.PersonService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("/by-city")
    public List<Person> getPersonsByCity(@RequestParam(name = "city") String city) {
        return personService.getPersonsByCity(city);
    }

    @GetMapping("/by-age")
    public List<Person> getPersonsByCity(@RequestParam(name = "age") int age) {
        return personService.getPersonsByAgeLessThan(age);
    }

    @GetMapping("/by-name-surname")
    public Optional<Person> getPersonsByCity(@RequestParam(name = "name") String name, @RequestParam(name = "surname")String surname) {
        return personService.getPersonsByNameAndSurname(name, surname);
    }
}
