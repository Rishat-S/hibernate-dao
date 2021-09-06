package ru.netology.hibernatedemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.netology.hibernatedemo.entity.Person;
import ru.netology.hibernatedemo.repository.PersonCrudRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    @Autowired
    PersonCrudRepository personCrudRepository;

    public List<Person> getPersonsByCity(String city) {
        return personCrudRepository.findByCityOfLiving(city);
    }

    public List<Person> getPersonsByAgeLessThan(int age) {
        return personCrudRepository.findByContact_AgeLessThanOrderByContact_Age(age);
    }

    public Optional<Person> getPersonsByNameAndSurname(String name, String surname) {
        return personCrudRepository.findByContact_NameAndContact_Surname(name, surname);
    }
}

