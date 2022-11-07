package org.example;
import Superhero.Superhero;

import java.util.ArrayList;
import java.util.List;

public class Database {

    private ArrayList<Superhero> heroDatabase;
    private ArrayList<Superhero> soegeResultat;

    //Opretter Superheroes
    public Database() {
        Superhero s1 = new Superhero("Stark", "Intelligent", false, 1925);
        Superhero s2 = new Superhero("Hulk", "Ultra Strength", true, 1950);
        Superhero s3 = new Superhero("Batman", "High Teknologi And Rich", false, 2005);
        Superhero s4 = new Superhero("Spiderman", "Fast and Smart", true, 2006);
        //Laver en arrayliste som printer superheroes ud

        heroDatabase = new ArrayList<>(List.of(s1, s2, s3, s4));
        soegeResultat = new ArrayList<>();
    }

    public void addSuperheroes(String name, boolean isHuman, String superPower, int creationYear, double strength) {
        heroDatabase.add(new Superhero(name, isHuman, superPower, creationYear, strength));
    }

    public Superhero findSuperhero(String name) {
        for (Superhero s : heroDatabase) {
            if (s.getName().equals(name)) ;
            {
                return s;
            }
        }
        return null;
    }

    public ArrayList<Superhero> findSuperheroes(String name) {
        for (Superhero s : heroDatabase) {
            if (s.getName().equals(name))
                soegeResultat.add(s);
        }
        return soegeResultat;
    }

    public ArrayList<Superhero> getHeroDatabase() {
        return heroDatabase;
    }

    public void addToDatabase(String name, boolean isHuman, String superPower, int creationYear, double strength) {

        heroDatabase.add(new Superhero(name, isHuman, superPower, creationYear, strength));




    }

    public ArrayList<Superhero> getSuperheroes() {
        return getSuperheroes();
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
            heroBuilder.append(String.format("'%s;%s;%s;%s;%s\n", superhero.getName(), superhero.getisHuman(), superhero.getSuperPower(), superhero.getCreationYear(), superhero.getStrength()));
        }
        return heroBuilder.toString();
    }
}







