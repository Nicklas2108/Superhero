package org.example;


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
    public Collection<Object> getHeroDatabase() {
        return getHeroDatabase();
    }
    public Superhero findSuperhero(String findHero) {
        return findSuperhero(findHero);

    }
    public void deleteHero(int ri) {
        deleteHero(ri);
    }
}
