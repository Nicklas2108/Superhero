import Superhero.Superhero;
import org.junit.jupiter.api.Test;

public class Herotest {
    private Superhero s;

    void setup() {
        // lavet et arrange for min herotest
        s = new Superhero("Hulk", false, "Ultra Strength", 1950, 100.0);
    }
    @Test
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

