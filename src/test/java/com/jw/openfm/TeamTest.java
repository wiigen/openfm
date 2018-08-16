package com.jw.openfm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.jw.openfm.domain.Team;

public class TeamTest {

    @Test
    public void testGetName() {
        assertEquals("Liverpool", new Team("Liverpool").getName());
    }

    @Test
    public void testEquals() {
        assertEquals(new Team("Liverpool"), new Team("Liverpool"));
        assertNotEquals(new Team("Liverpool"), new Team("Everton"));
        assertNotEquals(new Team("Liverpool"), null);
    }

}
