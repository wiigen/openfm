package com.jw.openfm.domain;

import static org.junit.Assert.*;

import org.joda.time.LocalDate;
import org.junit.Test;

public class PlayerTest {

    @Test
    public void testGetPosition() {
        Player player = new Player(new Name("Garreth", "Bale"), LocalDate.now(), Position.MR);
        assertEquals(Position.MR, player.getPosition());
    }

}
