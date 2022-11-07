package Filehandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class FileHandler {

    private Scanner scanner;
    private final File file = new File("demo.txt");
    PrintStream printStream;

    public FileHandler() {
        try {
            printStream = new PrintStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void saveData(String s) {
        printStream.println(s);
    }


}