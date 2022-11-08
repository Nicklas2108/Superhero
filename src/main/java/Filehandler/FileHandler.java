package Filehandler;
import Superhero.Superhero;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {

    private File file = new File("demo.txt");

    public void saveToFile(ArrayList<Superhero> superheroes) {
        try {
            PrintStream printStream = new PrintStream(file);
            for (Superhero superhero : superheroes) {
                printStream.println(superhero.getName() + ',' +
                        superhero.getisHuman() + ',' +
                        superhero.getSuperPower() + ',' +
                        superhero.getCreationYear() + ',' +
                        superhero.getStrength());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    public ArrayList<Superhero> readFromFile() {

        //Todo slet hardkode
        // try {
        // Scanner sc = new Scanner(f);

    Superhero s1 = new Superhero("Iron Man", true,"Intelligent",  1925, 75.0);
            Superhero s2 = new Superhero("Hulk", false, "Ultra Strength", 1950, 100.0);
            Superhero s3 = new Superhero("Batman", true, "Wealth And High technology",  2005, 65.0);
            Superhero s4 = new Superhero("Spiderman", true, "Fast And Smart", 2006, 65.0);
            Superhero s5 = new Superhero("Spiderman", true, "Arrogant", 2006, 65.0);
            //Laver en arrayliste som printer superheroes ud

            return new ArrayList<>(List.of(s1, s2, s3, s4,s5));
    }
}


