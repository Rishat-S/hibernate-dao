package ru.netology.hibernatedemo.repository;

import org.springframework.stereotype.Repository;
import ru.netology.hibernatedemo.model.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Repository
public class EntityRepository {

    @PersistenceContext
    EntityManager entityManager;

    public List<Person> getPersonsByCity(String city) {
        List<Person> result = new ArrayList<>();
        result.add(new Person()); //FIXME:
        return result;
    }
}
