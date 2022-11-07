import Superhero.Superhero;

public class Herotest {
    private Superhero s;
    void setup() {
        // lavet et arrange for min herotest
        s = new Superhero("Hulk", "Ultra Strength", true, 1950);
    }
    //Test
    void Superhero() {
        //arrange test
        String Superhero = s.getSuperPower();
        //act
        s.getSuperPower();
        //Asseert
        assertEquals(s.getSuperPower());
    }
    private void assertEquals(String superPower) {
    }

    // File file = new File( file "demo.txt")
}
// User story # 10
// As a superhero enthusiast I want to be able to persist my superheroes in a local text file.
//Acceptance criteria:
// Superheroes are persisted correctly when the program exits and can be reloaded correctly again when the program is restarted


// Kan ikke kører programmet, fordi min herotest ligger forkert
