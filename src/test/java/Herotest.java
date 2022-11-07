import org.example.Superhero;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
// Kan ikke kører programmet, fordi min herotest ligger forkert
