import java.util.Comparator;

public class VegetableCaloriesComparator implements Comparator<Vegetable> {

    public int compare(Vegetable a, Vegetable b) {
        return Integer.compare(a.getVegetableCalories(), b.getVegetableCalories());
    }
}