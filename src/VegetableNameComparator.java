import java.util.Comparator;

public class VegetableNameComparator implements Comparator<Vegetable> {

    public int compare(Vegetable a, Vegetable b) {
        return a.getVegetableName().compareTo(b.getVegetableName());
    }
}
