package Comparator;
import Superhero.Superhero;
import java.util.Comparator;

public class ComparatorCreationYear implements Comparator<Superhero> {
    @Override
    public int compare(Superhero o1, Superhero o2) {
        return Integer.compare(o1.getCreationYear(), o2.getCreationYear());
    }
}
