package ru.netology.hibernatedemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.netology.hibernatedemo.entity.Person;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonCrudRepository extends CrudRepository<Person, Long> {

    List<Person> findByCityOfLiving(String city);

    List<Person> findByContact_AgeLessThanOrderByContact_Age(int age);

    Optional<Person> findByContact_NameAndContact_Surname(String name, String surname);

}
