package com.jw.openfm.csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.joda.time.LocalDate;

import com.jw.openfm.domain.Player;
import com.jw.openfm.domain.Position;
import com.jw.openfm.util.IOUtils;

public class CsvReader {

    private static final String SEPERATOR = ",";

    public List<Player> getPlayers() {
        List<Player> players = new ArrayList<Player>();

        BufferedReader br = null;
        String line = "";
        try {
            InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream("./players.db.csv");
            br = new BufferedReader(new InputStreamReader(resourceAsStream));
            while ((line = br.readLine()) != null) {
                players.add(mapToPlayer(line.split(SEPERATOR)));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found", e);
        } catch (IOException e) {
            throw new RuntimeException("Error reading CSV", e);
        } finally {
            IOUtils.closeQuietly(br);
        }

        return players;
    }

    private Player mapToPlayer(String[] csv) {
        return new Player(csv[0],
                csv[1],
                LocalDate.parse(csv[2]),
                Position.valueOf(csv[3]));
    }

}
