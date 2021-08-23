package ru.netology.hibernatedemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.netology.hibernatedemo.entity.Person;
import ru.netology.hibernatedemo.repository.PersonRepository;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    PersonRepository entityRepository;


    public List<Person> getPersonsByCity(String city) {
        return entityRepository.getPersonsByCity(city);
    }
}

