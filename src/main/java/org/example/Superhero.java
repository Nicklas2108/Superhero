package org.example;

public class Superhero {
    // Attributterne som jeg benytter i dette tilfælde
    private String name;
    private boolean isHuman;
    private String superPower;
    private int creationYear;
    private double strength;
   //Konstruktør opretter obejtker
    public Superhero(String name, boolean isHuman, String superPower, int creationYear, double strength) {
        this.name = name;
        this.isHuman = isHuman;
        this.superPower = superPower;
        this.creationYear = creationYear;
        this.strength = strength;
    }

    // get metode
    public Superhero(String stark, String avengers, boolean b, int strength) {
    }
    public String getName() {
        return name;
    }

    public boolean getisHuman() {
        return isHuman;
    }
    public String getSuperPower() {
        return superPower;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public double getStrengh() {
        return strength;
    }
}


