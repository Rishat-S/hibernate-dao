package ru.netology.hibernatedemo.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Person {

    @EmbeddedId
    Contact contact;
    String phoneNumber;
    String cityOfLiving;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Person person = (Person) o;

        return Objects.equals(contact, person.contact);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(contact);
    }
}
