package ru.netology.hibernatedemo.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Person {

    @EmbeddedId
    Contact contact;
    String phoneNumber;
    String cityOfLiving;

    public Person() {

    }
}
