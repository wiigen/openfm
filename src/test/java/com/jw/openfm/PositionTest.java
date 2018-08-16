package com.jw.openfm;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jw.openfm.domain.Position;

public class PositionTest {

    @Test
    public void testGetDescription() {
        assertEquals("Goalkeeper", Position.GK.getDescription());;
    }

    @Test
    public void testValueOf() {
        assertEquals("Goalkeeper", Position.valueOf("GK").getDescription());
    }

}
