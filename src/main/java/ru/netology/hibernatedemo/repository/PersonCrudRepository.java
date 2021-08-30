package ru.netology.hibernatedemo.repository;

import org.springframework.data.repository.CrudRepository;
import ru.netology.hibernatedemo.entity.Person;

public interface PersonCrudRepository extends CrudRepository<Person, Long> {


}
