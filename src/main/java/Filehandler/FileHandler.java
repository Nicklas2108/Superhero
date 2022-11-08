package Filehandler;
import Superhero.Superhero;
import java.io.*;
import java.util.ArrayList;

public class FileHandler {

    private File file = new File("demo.txt");

    public void saveToFile(ArrayList<Superhero> superheroes) {
        try {
            PrintStream printStream = new PrintStream(new FileOutputStream(file, true));
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
}
