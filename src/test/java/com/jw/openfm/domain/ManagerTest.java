package com.jw.openfm.domain;

import static org.junit.Assert.*;

import org.joda.time.LocalDate;
import org.junit.Test;

public class ManagerTest {

    @Test
    public void testGetName() {
        Manager manager = new Manager("Jurgen", "Klopp", LocalDate.now());
        assertEquals("Jurgen Klopp", manager.getName());
    }

}
