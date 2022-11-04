package org.example.UI;
import org.example.Database;
import org.example.Superhero;

import java.util.ArrayList;
import java.util.Collection;

public class Controller {
    public Database databse = new Database();

    public ArrayList <Superhero> getSuperheroes()
    {
        return databse.getSuperheroes();

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
}
