package com.jw.openfm.domain;

import org.joda.time.LocalDate;
import org.joda.time.Years;

import lombok.Data;

@Data
public class Person {
    private final String firstname;
    private final String lastname;
    private final LocalDate birthdate;

    //TODO: kan være fler - kanskje vurdere å opprette egne objekter for nasjoner.
    private String nationality;

    public String getName() {
        return ((firstname != null ? firstname : "") +
                " " + (lastname != null ? lastname : "")).trim();
    }

    public int getAge(LocalDate gamedate) {
        return Years.yearsBetween(birthdate, gamedate).getYears();
    }

}
