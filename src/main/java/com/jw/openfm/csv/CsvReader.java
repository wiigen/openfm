package com.jw.openfm.csv;

import com.jw.openfm.domain.Name;
import com.jw.openfm.domain.Player;
import com.jw.openfm.domain.Position;
import com.jw.openfm.util.IOUtils;
import org.joda.time.LocalDate;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {

    private static final String SEPARATOR = ",";

    public List<Player> getPlayers() {
        List<Player> players = new ArrayList<Player>();

        BufferedReader br = null;
        String line;
        try {
            InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream("./players.db.csv");
            br = new BufferedReader(new InputStreamReader(resourceAsStream));
            while ((line = br.readLine()) != null) {
                players.add(mapToPlayer(line.split(SEPARATOR)));
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
        Name name = new Name(csv[0], csv[1]);
        return new Player(name,
                LocalDate.parse(csv[2]),
                Position.valueOf(csv[3]));
    }

}
