package Superhero;


public class Superhero implements Comparable<Superhero> {
    // Attributterne som jeg benytter i dette tilfælde
    private String name;
    private boolean isHuman;
    private String superPower;
    private int creationYear;
    private double strength;


    @Override
    public int compareTo(Superhero o) {
        return this.name.compareTo(o.name);
    }


    //Konstruktør opretter obejtker
    public Superhero(String name, boolean isHuman, String superPower, int creationYear, double strength) {
        this.name = name;
        this.isHuman = isHuman;
        this.superPower = superPower;
        this.creationYear = creationYear;
        this.strength = strength;
    }
    // get og set metode

    public String getName() {
        return name;
    }

    public String setName() {
        return name;
    }

    public boolean getisHuman() {
        return isHuman;
    }

    public String getSuperPower() {
        return superPower;
    }

    public String setSuperpower() {
        return superPower;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public int setCreationYear() {
        return creationYear;
    }

    public double getStrength() {
        return strength;
    }

    public double setStrength() {
        return strength;
    }
}


