package com.jw.openfm.domain;

import java.util.HashSet;
import java.util.Set;

public class League {

    private String name;
    private final Set<Team> teams;

    public League(String name, Set<Team> teams) {
        this.name = name;
        this.teams = teams;
    }

    public League(String name) {
        this.name = name;
        this.teams = new HashSet<Team>();
    }

    /**
     * Change name of the league
     * 
     * @param name new name
     */
    public void changeName(String name) {
        this.name = name;
    }

    /**
     * Add team to league. For example when promoted
     * 
     * @param team to add
     */
    public void addTeam(Team team) {
        teams.add(team);
    }

    /**
     * Remove team from league. For example at relegation
     * 
     * @param team to remove
     */
    public void removeTeam(Team team) {
        teams.remove(team);
    }

    public String getName() {
        return name;
    }

    public Set<Team> getTeams() {
        return teams;
    }

}

