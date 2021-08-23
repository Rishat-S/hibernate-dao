package ru.netology.hibernatedemo.repository;

import org.springframework.stereotype.Repository;
import ru.netology.hibernatedemo.entity.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class PersonRepository {

    @PersistenceContext
    EntityManager entityManager;

    public List<Person> getPersonsByCity(String city) {
        Query query = entityManager.createQuery("select p from Person p where p.cityOfLiving = :city", Person.class);
        query.setParameter("city", city);
        var result = query.getResultList();
        return result;
    }
}
