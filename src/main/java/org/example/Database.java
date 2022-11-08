package org.example;
import Superhero.Superhero;
import java.util.ArrayList;
import java.util.List;

public class Database {

    private ArrayList<Superhero> heroDatabase;
    private ArrayList<Superhero> soegeResultat;

    //Opretter Superheroes
    public Database() {
        Superhero s1 = new Superhero("Stark", false,"Intelligent",  1925, 75.0);
        Superhero s2 = new Superhero("Hulk", true, "Ultra Strength", 1950, 100.0);
        Superhero s3 = new Superhero("Batman", false, "wealth and high technology",  2005, 65.0);
        Superhero s4 = new Superhero("Spiderman", true, "fast and smart", 2006, 65.0);
        //Laver en arrayliste som printer superheroes ud

        heroDatabase = new ArrayList<>(List.of(s1, s2, s3, s4));
        soegeResultat = new ArrayList<>();
    }

    public void addSuperheroes(String name, boolean isHuman, String superPower, int creationYear, double strength) {
        heroDatabase.add(new Superhero(name, isHuman, superPower, creationYear, strength));
    }

    public Superhero findSuperhero(String name) {
        for (Superhero superhero : heroDatabase) {

            if (superhero.getName().equals(name)) {
                return superhero;
            }
        } return null;
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







