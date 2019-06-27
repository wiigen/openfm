package com.jw.openfm.domain;

import org.joda.time.LocalDate;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void testGetName() {
        Person person = new Person(new Name("John", "Doe"), LocalDate.now());
        assertEquals("John Doe", person.getName().getFullname());
        assertEquals("John", person.getName().getFirstname());
        assertEquals("Doe", person.getName().getLastname());

        assertEquals("John", new Person(new Name("John", null), LocalDate.now()).getName().getFullname());

        assertEquals("Doe", new Person(new Name(null, "Doe"), LocalDate.now()).getName().getFullname());
    }

    @Test
    public void testGetAge() {
        LocalDate dateOfBirth = LocalDate.now().minusYears(25);
        Person person = new Person(new Name("John", "Doe"), dateOfBirth);
        assertEquals(dateOfBirth, person.getDateOfBirth());
        assertEquals(25, person.getAge(LocalDate.now()));
    }

}
