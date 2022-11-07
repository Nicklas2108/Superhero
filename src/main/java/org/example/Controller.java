package org.example;

import Superhero.Superhero;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.FileHandler;

public class Controller {
    public Database database = new Database();
    public FileHandler fileHandler = new FileHandler();

    public Controller() throws IOException {
    }

    public ArrayList<Superhero> getSuperheroes() {
        return database.getSuperheroes();
    }

    public void addSuperheroes(String name, boolean b, String power, int year, double strength) {
    }

    public ArrayList<Superhero> getHeroDatabase() {
        return getHeroDatabase();
    }

    public Superhero findSuperhero(String findHero) {
        return findSuperhero(findHero);
    }

    public void deleteHero(int ri) {
        deleteHero(ri);
    }
    public void saveToFile() {
        fileHandler.close();
    }
}
