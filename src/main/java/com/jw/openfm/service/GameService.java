package com.jw.openfm.service;

import com.jw.openfm.domain.Game;
import com.jw.openfm.domain.League;
import com.jw.openfm.util.IOUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GameService {

    /**
     * Starts a new game
     * 
     * @param name Name of the game
     * @return
     */
    public Game startGame(String name) {
        return new Game(name);
    }

    public void selectLeague(Game game, League league) {
        game.setSelectedLeague(league);
    }

    /**
     * Load gameobject from disc into memory
     * 
     * @param filename (full path) Name of the file to load
     * @return Gameobject loaded into memory
     */
    public Game loadGame(String filename) {
        FileInputStream fis;
        ObjectInputStream in = null;
        try {
            fis = new FileInputStream(filename);
            in = new ObjectInputStream(fis);
            return (Game) in.readObject();
        } catch (Exception e) {
            throw new RuntimeException("Error loading game", e);
        } finally {
            IOUtils.closeQuietly(in);
        }
    }

    public void saveGame(Game game) {
        FileOutputStream fos;
        ObjectOutputStream out = null;
        try {
            fos = new FileOutputStream(game.getName() + ".game");
            out = new ObjectOutputStream(fos);
            out.writeObject(game);
        } catch (Exception e) {
            throw new RuntimeException("Error saving game", e);
        } finally {
            IOUtils.closeQuietly(out);
        }
    }

}
