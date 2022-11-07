package org.example.UI;

import Filehandler.FileHandler;
import Superhero.Superhero;
import org.example.Database;

import java.util.ArrayList;

public class Controller {
    public Database database = new Database();
    private FileHandler fileHandler = new FileHandler();

    public ArrayList<Superhero> getSuperheroes() {
        return database.getSuperheroes();
    }

    public void addSuperheroes(String name, boolean b, String power, int year, double strength) {
    }

    public ArrayList<Superhero> getHeroDatabase() {
        return database.getHeroDatabase();
    }

    public Superhero findSuperhero(String findHero) {
        return findSuperhero(findHero);
    }

    public void deleteHero(int ri) {
        deleteHero(ri);
    }

    public void saveToFile() {
        fileHandler.saveToFile(getHeroDatabase());
    }
}
