package Filehandler;

import Superhero.Superhero;

import java.io.*;
import java.util.ArrayList;
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


    public void saveToFile(ArrayList<Superhero> superheroList) {
        FileWriter save;
        try {
            save = new FileWriter(file);
            for (Superhero superhero : superheroList) {
                save.write(superhero.getName() + ';' +
                        superhero.getisHuman() + ';' +
                        superhero.getSuperPower() + ';' +
                        superhero.getCreationYear() + ';' +
                        superhero.getStrength() + "\n");
            }
            save.close();
            if (superheroList.isEmpty()){
                System.out.println("den er tom");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Superhero> loadFile() {
        ArrayList<Superhero> superheroes = new ArrayList<>();
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String[] attribute = sc.nextLine().split(";");
                Superhero loadSuperhero = new Superhero(
                        attribute[0],
                        Boolean.parseBoolean(attribute[1]),
                        attribute[2],
                        Integer.parseInt(attribute[3]),
                        Double.parseDouble(attribute[4])
                );
                superheroes.add(loadSuperhero);
            }
            sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return superheroes;
    }
}










