package ru.netology.hibernatedemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.hibernatedemo.entity.Person;
import ru.netology.hibernatedemo.service.PersonService;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    PersonService entityService;

    @GetMapping("/by-city")
    public List<Person> getPersonsByCity(@RequestParam(name = "city") String city) {
        return entityService.getPersonsByCity(city);
    }
}
