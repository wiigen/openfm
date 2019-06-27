package com.jw.openfm.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PositionTest {

    @Test
    public void testGetDescription() {
        assertEquals("Goalkeeper", Position.GK.getDescription());
    }

    @Test
    public void testValueOf() {
        assertEquals("Goalkeeper", Position.valueOf("GK").getDescription());
    }

}
