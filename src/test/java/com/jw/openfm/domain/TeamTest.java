package com.jw.openfm.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TeamTest {

    @Test
    public void shouldChangeName() {
        Team team = new Team("Team 1");
        team.changeName("Team 2");
        assertEquals("Team 2", team.getName());
    }

    @Test
    public void shouldEqual() {
        Team team1 = new Team("Team 1");
        assertEquals(team1, new Team("Team 1"));
        assertEquals(team1, team1);
        assertEquals(new Team(null), new Team(null));
    }

    @Test
    public void shouldNotEqual() {
        assertNotEquals(new Team("Team 1"), new Team("Team 2"));
        assertNotEquals(new Team("Team 1"), null);
        assertNotEquals(new Team(null), new Team("Team 2"));
        assertNotEquals(new Team("Team 1"), new League("Team 1"));
    }

    @Test
    public void shouldGetName() {
        assertEquals("Liverpool", new Team("Liverpool").getName());
    }

}
