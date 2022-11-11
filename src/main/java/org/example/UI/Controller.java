package org.example.UI;

import Comparator.*;
import Filehandler.FileHandler;
import Superhero.Superhero;
import org.example.Database;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
        if (isChanged) {
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

    public void comparatorSort(String type) {

        Comparator<Superhero> comparator = comparatorSelection(type);

        Collections.sort(database.getHeroDatabase(), comparator);
    }

    public void comparatorSort(String type, String sType) {

        Comparator<Superhero> comparator = comparatorSelection(type);
        Comparator<Superhero> comparatorS = comparatorSelection(sType);

        Collections.sort(database.getHeroDatabase(), comparator.thenComparing(comparatorS));
    }

    public Comparator<Superhero> comparatorSelection(String type) {
        return switch (type) {
            case "CreationYear" -> new ComparatorCreationYear();
            case "Ishuman" -> new ComparatorIsHuman();
            case "Superpower" -> new ComparatorSuperPower();
            case "Strength" -> new ComparatorStrength();
            case "Name" -> new ComparatorName();
            default -> null;
        };
    }

    public void fileSaver () {
        fileHandler.saveToFile(database.getHeroDatabase());
    }
}

