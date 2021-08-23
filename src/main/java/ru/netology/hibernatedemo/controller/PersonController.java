package ru.netology.hibernatedemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.hibernatedemo.model.Person;
import ru.netology.hibernatedemo.service.EntityService;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class EntityController {

    @Autowired
    EntityService entityService;

    @GetMapping("/by-city")
    public List<Person> getPersonsByCity(@RequestParam(name = "city") String city) {
        return entityService.getPersonsByCity(city);
    }
}
