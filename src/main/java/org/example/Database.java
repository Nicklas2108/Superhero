package org.example;
import java.util.ArrayList;
import java.util.List;

public class Database {

    private ArrayList<Superhero> heroDatabase;
    private ArrayList<Superhero> soegerresultat;

   public Database() {
       Superhero s1 = new Superhero("Stark", "Intelligent", false,1925);
       Superhero s2 = new Superhero("Hulk", "Ultra Strength", true, 1950);
       Superhero s3 = new Superhero("Batman", "High Teknologi And Rich",false, 2005);
       Superhero s4 = new Superhero("Spiderman", "Fast and Smarth", true, 2006);

       heroDatabase = new ArrayList<Superhero>(List.of(s1,s2,s3,s4));
       soegerresultat = new ArrayList<Superhero>();
   }
   public Superhero findSuperhero(String name){
       for (Superhero s : heroDatabase){
           if (s.getName().equals(name));{
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


    public ArrayList<Superhero> getHeroDatabase() {
        return heroDatabase;
    }

    public void addToDatabse(String name, boolean isHuman, String superPower, int creationYear, double strength) {
        heroDatabase.add(new Superhero(name, isHuman, superPower, creationYear, strength));
    }

    public void addSuperheroes(String name, boolean isHuman, String superPower, int creationYear, double strength) {
        Superhero superhero = new Superhero(name, isHuman, superPower, creationYear, strength);

    }


}




