package com.jw.openfm.domain;

import org.joda.time.LocalDate;

import lombok.Getter;

@Getter
public class Player extends Person {

    private final Position position;

    /**
     * Technical attributes:
     * -  private int finishing;
     * -  private int technique;
     * -  private int passing;
     * -  private int defending;
     * Mental attributes:
     * -  private int creativity;
     * -  private int teamwork;
     * -  private int determination;
     * -  private int aggression;
     * Physical attributes:
     * -  private int speed;
     * -  private int jumping;
     * -  private int strength;
     * -  private int stamina;
     * Goalkeeper attributes:
     * -  private int arialability;
     * -  private int communication;
     * -  private int technique;
     * -  private int reflexes; 
     */

    public Player(String firstname, String lastname, LocalDate birthdate, Position position) {
        super(firstname, lastname, birthdate);
        this.position = position;
    }

}
