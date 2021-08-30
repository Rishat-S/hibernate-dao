package ru.netology.hibernatedemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.netology.hibernatedemo.entity.Person;
import ru.netology.hibernatedemo.repository.PersonCrudRepository;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    PersonCrudRepository personCrudRepository;

    public List<Person> getPersonsByCity(String city) {
        return personCrudRepository.findByCityOfLiving(city);
    }
}

