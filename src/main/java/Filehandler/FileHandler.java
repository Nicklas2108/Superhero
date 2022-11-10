package Filehandler;

import Superhero.Superhero;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileHandler {

    private File file = new File("demo.txt");
    Scanner sc;

    public ArrayList<Superhero> readFromFile() {

        //Todo slet hardkode
        // try {
        // Scanner sc = new Scanner(f);

        /*Superhero s1 = new Superhero("Iron Man", true, "Intelligent", 1925, 75.0);
        Superhero s2 = new Superhero("Hulk", false, "Ultra Strength", 1950, 100.0);
        Superhero s3 = new Superhero("Batman", true, "Wealth And High technology", 2005, 65.0);
        Superhero s4 = new Superhero("Spiderman", true, "Fast And Smart", 2006, 65.0);
        Superhero s5 = new Superhero("Spiderman", true, "Arrogant", 2006, 65.0);

       */
        //Laver en arrayliste som printer superheroes ud

        // return new ArrayList<>(List.of(s1, s2, s3, s4, s5));
        return null;
    }


    public void saveToFile(ArrayList<Superhero> superheroes) {
        try {
            PrintStream printStream = new PrintStream(file);
            for (Superhero superhero : superheroes) {
                printStream.println(superhero.getName() + ';' +
                        superhero.getisHuman() + ';' +
                        superhero.getSuperPower() + ';' +
                        superhero.getCreationYear() + ';' +
                        superhero.getStrength());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public ArrayList<Superhero> loadFile() {
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        ArrayList<Superhero> superheroes = new ArrayList<>();
        while (sc.hasNextLine()) {
            String linje = sc.nextLine();
            String[] attributter = linje.split(";");

            // er superheroes obejkter med konveterede attributter
            Superhero indtastSuperhero = new Superhero(
                    attributter[0], //navn
                    Boolean.parseBoolean(attributter[1]), //is human
                    attributter[2], //superpower
                    Integer.parseInt(attributter[3]),// year
                    Double.parseDouble(attributter[4]) //strength


            );
            //Tilføjer personobjetk i Arrwayliste
            superheroes.add(indtastSuperhero);

        }
        sc.close();
        return superheroes;

    }
}










