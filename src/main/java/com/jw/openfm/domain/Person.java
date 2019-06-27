package com.jw.openfm.domain;

import org.joda.time.LocalDate;
import org.joda.time.Years;

public class Person {
    private final Name name;
    private final LocalDate dateOfBirth;

    public Person(Name name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    //TODO: multiple? - add Nationality as a class instead of string.
    private String nationality;

    public int getAge(LocalDate gamedate) {
        return Years.yearsBetween(dateOfBirth, gamedate).getYears();
    }

    public Name getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

}
