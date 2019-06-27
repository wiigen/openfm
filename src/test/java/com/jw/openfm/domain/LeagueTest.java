package com.jw.openfm.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class LeagueTest {

    @Test
    public void shouldGetName() {
        League premierLeague = new League("Premier League");
        assertEquals("Premier League", premierLeague.getName());

        premierLeague.changeName("PL");
        assertEquals("PL", premierLeague.getName());
    }

    @Test
    public void shouldNotHaveDuplicateTeams() {
        List<Team> teams = new ArrayList<Team>();
        teams.add(new Team("Liverpool"));
        teams.add(new Team("Arsenal"));
        teams.add(new Team("Liverpool")); // Duplicate
        Set<Team> teamSet = new HashSet<Team>(teams);

        League premierLeague = new League("Premier League", teamSet);
        assertEquals(2, premierLeague.getTeams().size());
    }

    @Test
    public void test() {
        League league = new League("League 1");
        league.addTeam(new Team("Team 1"));
        league.addTeam(new Team("Team 2"));

        assertEquals(2, league.getTeams().size());
        assertTrue(league.getTeams().contains(new Team("Team 1")));
        assertTrue(league.getTeams().contains(new Team("Team 2")));
    }

    @Test
    public void shouldRemoveTeam() {
        League league = new League("League 1");
        league.addTeam(new Team("Team 1"));
        league.addTeam(new Team("Team 2"));

        assertEquals(2, league.getTeams().size());
        league.removeTeam(new Team("Team 2"));
        assertEquals(1, league.getTeams().size());
    }

}
