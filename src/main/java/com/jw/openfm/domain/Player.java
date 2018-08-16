package com.jw.openfm.domain;

import org.joda.time.LocalDate;

import lombok.Getter;

@Getter
public class Player extends Person {

    private final Position position;

    public Player(String firstname, String lastname, LocalDate birthdate, Position position) {
        super(firstname, lastname, birthdate);
        this.position = position;
    }

}
