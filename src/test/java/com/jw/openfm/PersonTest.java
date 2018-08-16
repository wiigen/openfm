package com.jw.openfm;

import static org.junit.Assert.*;

import org.joda.time.LocalDate;
import org.junit.Test;

import com.jw.openfm.domain.Person;

public class PersonTest {

    @Test
    public void testGetName() {
        Person person = new Person("John", "Doe", LocalDate.now());
        assertEquals("John Doe", person.getName());
        assertEquals("John", person.getFirstname());
        assertEquals("Doe", person.getLastname());

        assertEquals("John", new Person("John", null, LocalDate.now()).getName());

        assertEquals("Doe", new Person(null, "Doe", LocalDate.now()).getName());
    }

    @Test
    public void testGetAge() {
        LocalDate birtday = LocalDate.now().minusYears(25);
        Person person = new Person("John", "Doe", birtday);
        assertEquals(birtday, person.getBirthdate());
        assertEquals(25, person.getAge(LocalDate.now()));
    }

}
