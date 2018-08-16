package com.jw.openfm.domain;

import java.io.Serializable;

import org.joda.time.LocalDate;

import lombok.Data;

@Data
public class Game implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String name;

    private League selectedLeague;

    private LocalDate gamedate;

    /**
     * Update gamedate
     * 
     * @param gamedate new gamedate
     */
    public void setGamedate(LocalDate gamedate) {
        this.gamedate = gamedate;
    }

}
