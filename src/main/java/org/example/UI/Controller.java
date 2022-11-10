package org.example.UI;

import Comparator.*;
import Filehandler.FileHandler;
import Superhero.Superhero;
import org.example.Database;

import java.util.ArrayList;
import java.util.Collections;

public class Controller {
    public Database database = new Database();
    private FileHandler fileHandler = new FileHandler();
    private boolean isChanged = false;

    public ArrayList<Superhero> getSuperheroes() {
        return database.getHeroDatabase();
    }

    public void addSuperheroes(String name, boolean b, String power, int year, double strength) {
        database.getHeroDatabase().add(new Superhero(name, b, power, year, strength));
    }

    public ArrayList<Superhero> getHeroDatabase() {
        return database.getHeroDatabase();
    }

    public Superhero findSuperhero(String findHero) {
        if (isChanged){
            return database.findSuperhero(findHero);

        }
        return null;
    }

    public void deleteHero(int ri) {
        if (isChanged)
           database.deleteHero(ri);
    }

    public void saveToFile() {
        if (isChanged)
            fileHandler.saveToFile(getHeroDatabase());


    }

    public void loadFile() {
        ArrayList<Superhero> superheroes = fileHandler.loadFile();
        database.setHeroDatabase(superheroes);

    }
    public void sortName() {
        database.sortName();
    }

    public void sortHuman() {
        database.sortHuman();
    }

    public void sortSuperPower() {
        database.sortSuperPower();
    }

    public void sortCreationYear() {
        database.sortCreationYear();
    }

    public void sortStrengh() {
        database.sortStrengh();
    }
}
