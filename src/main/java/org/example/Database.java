package org.example;

import Comparator.*;
import Superhero.Superhero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Database {

    private ArrayList<Superhero> heroDatabase;
    private ArrayList<Superhero> soegeResultat;

    //Opretter Superheroes
    public Database() {
        soegeResultat = new ArrayList<Superhero>();
        heroDatabase = new ArrayList<Superhero>();
    }

    public void addSuperheroes(String name, boolean isHuman, String superPower, int creationYear, double strength) {
        heroDatabase.add(new Superhero(name, isHuman, superPower, creationYear, strength));
    }

    public Superhero findSuperhero(String name) {
        for (Superhero superhero : heroDatabase) {

            if (superhero.getName().equals(name)) {
                return superhero;
            }
        }
        return null;
    }

    public ArrayList<Superhero> findSuperheroes(String name) {
        for (Superhero superhero : heroDatabase) {
            if (superhero.getName().equals(name))
                soegeResultat.add(superhero);
        }
        return soegeResultat;
    }

    public ArrayList<Superhero> getHeroDatabase() {
        return heroDatabase;
    }

    public void addToDatabase(String name, boolean isHuman, String superPower, int creationYear, double strength) {

        heroDatabase.add(new Superhero(name, isHuman, superPower, creationYear, strength));

    }


    public void editSuperhero(String name, boolean isHuman, String superPower, int creationYear, double strength) {
        Superhero editSuperhero = new Superhero(name, isHuman, superPower, creationYear, strength);
    }

    public ArrayList<Superhero> editSuperhero() {
        return heroDatabase;
    }

    public void deleteHero(int heroToDelete) {

        int deleteOnIndex = heroToDelete - 1;
        System.out.println(heroDatabase.get(deleteOnIndex).getName() + " has been deleted");
        heroDatabase.remove(deleteOnIndex);
    }

    public String superheroArray() {
        StringBuilder heroBuilder = new StringBuilder();

        for (Superhero superhero : heroDatabase) {
            heroBuilder.append(String.format("'%s;%s;%s;%s;%s\n",
                    superhero.getName(),
                    superhero.getisHuman(),
                    superhero.getSuperPower(),
                    superhero.getCreationYear(),
                    superhero.getStrength()));
        }
        return heroBuilder.toString();
    }

    public void loadallheroes(ArrayList<Superhero> superheroes) {
        heroDatabase = superheroes;
    }

    public void setHeroDatabase(ArrayList<Superhero> superheroes) {
        heroDatabase = superheroes;

    }
    public void sortName() {
        Collections.sort(heroDatabase, new ComparatorName());
    }
    public void sortHuman() {
        Collections.sort(heroDatabase, new ComparatorIsHuman());
    }
    public void sortSuperPower() {
        Collections.sort(heroDatabase, new ComparatorSuperPower());
    }
    public void sortCreationYear() {
        Collections.sort(heroDatabase, new ComparatorCreationYear());
    }
    public void sortStrengh() {
        Collections.sort(heroDatabase, new ComparatorStrength());
    }


}







