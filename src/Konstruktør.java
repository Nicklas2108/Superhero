public class Konstruktør {
    // Constructor der ikke tager i mode superhero name.
    private String superheroName = "superheroname";
    private String superpower = "superpower";
    private String creationYear = "creationyear";
    private String realName = "realname";
    private String strength = "strength";
    private String database = "database";

    public String getSuperheroName() {
        return superheroName;
    }

    public String getSuperpower() {
        return superpower;
    }

    public String getCreationYear() {
        return creationYear;
    }

    public String getRealName() {
        return realName;
    }

    public String getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "SuperHero";
    }
}
