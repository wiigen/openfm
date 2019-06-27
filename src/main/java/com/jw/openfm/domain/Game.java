package com.jw.openfm.domain;

import org.joda.time.LocalDate;

import java.io.Serializable;

public class Game implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String name;

    private League selectedLeague;
    private LocalDate gamedate;

    public Game(String name) {
        this.name = name;
    }

    /**
     * Update gamedate
     * 
     * @param gamedate new gamedate
     */
    public void setGamedate(LocalDate gamedate) {
        this.gamedate = gamedate;
    }

    public String getName() {
        return name;
    }

	public League getSelectedLeague() {
		return selectedLeague;
	}

	public void setSelectedLeague(League selectedLeague) {
		this.selectedLeague = selectedLeague;
	}

}
