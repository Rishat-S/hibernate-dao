package ru.netology.hibernatedemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.netology.hibernatedemo.model.Person;
import ru.netology.hibernatedemo.repository.EntityRepository;

import java.util.List;

@Service
public class EntityService {
    @Autowired
    EntityRepository entityRepository;


    public List<Person> getPersonsByCity(String city) {
        return entityRepository.getPersonsByCity(city);
    }
}

