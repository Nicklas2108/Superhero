package org.example;

import java.util.ArrayList;
import java.util.List;

public class Database {

    private ArrayList<Superhero> heroDatabase;
    private ArrayList<Superhero> soegerresultat;

    //Opretter Superheroes
    public Database() {
        Superhero s1 = new Superhero("Stark", "Intelligent", false, 1925);
        Superhero s2 = new Superhero("Hulk", "Ultra Strength", true, 1950);
        Superhero s3 = new Superhero("Batman", "High Teknologi And Rich", false, 2005);
        Superhero s4 = new Superhero("Spiderman", "Fast and Smarth", true, 2006);
        //Laver en arrayliste som printer superheroes ud

        heroDatabase = new ArrayList<Superhero>(List.of(s1, s2, s3, s4));
        soegerresultat = new ArrayList<Superhero>();
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
                soegerresultat.add(s);
        }
        return soegerresultat;
    }

    public void addSuperheroes (String name,boolean isHuman, String superPower,int creationYear, double strength){
        Superhero superhero = new Superhero(name, isHuman, superPower, creationYear, strength);
        heroDatabase.add(superhero);
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

    public ArrayList<Superhero> editSuperhero () {
        return heroDatabase;
    }
    public void editSuperhero (String name,boolean isHuman, String superPower,int creationYear, double strength){
        Superhero editSuperhero = new Superhero(name,isHuman, superPower, creationYear, strength);

    }

    public void deleteHero(int heroToDelete) {

        int deleteOnIndex = heroToDelete - 1;

        System.out.println(heroDatabase.get(deleteOnIndex).getName() + " has been deleted");

        heroDatabase.remove(deleteOnIndex);
    }

}







