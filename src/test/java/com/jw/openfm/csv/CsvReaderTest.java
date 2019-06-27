package com.jw.openfm.csv;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.jw.openfm.domain.Player;

public class CsvReaderTest {

    @Test
    public void shouldReadPlayersFromCsv() {
        CsvReader csvReader = new CsvReader();
        List<Player> players = csvReader.getPlayers();

        assertEquals(1, players.size());
        assertEquals("Lionel", players.get(0).getName().getFirstname());
        assertEquals("Messi", players.get(0).getName().getLastname());
    }

}
