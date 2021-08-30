package ru.netology.hibernatedemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.netology.hibernatedemo.entity.Person;

import java.util.List;

@Repository
public interface PersonCrudRepository extends CrudRepository<Person, Long> {

    List<Person> findByCityOfLiving(String city);
}
