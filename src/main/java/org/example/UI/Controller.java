package org.example.UI;
import org.example.Database;
import Filehandler.FileHandler;
import Superhero.Superhero;
import java.util.ArrayList;

public class Controller {
    public Database database = new Database();
    private FileHandler fileHandler = new FileHandler();

    public ArrayList<Superhero> getSuperheroes() {
        return database.getSuperheroes();
    }

    public void addSupheroes(String name, boolean b, String power, int year, double strength) {
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

    public void saveData() {
        fileHandler.saveData(database.superheroArray());

    }
}
