package org.example;
import org.example.UI.Userinterface;
import java.io.FileNotFoundException;
import java.util.logging.FileHandler;

public class Main {

    public static void main(String[] args) throws FileNotFoundException  {
        Userinterface ui = new Userinterface();
        ui.startProgram();

    }
}