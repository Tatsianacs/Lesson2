import java.util.Comparator;

public class VegetableCaloriesComparator implements Comparator<Vegetable> {

    public int compare(Vegetable a, Vegetable b) {
        if (a.getVegetableCalories() > b.getVegetableCalories()) {
            return 1;
        } else if (a.getVegetableCalories() < b.getVegetableCalories()) {
            return -1;
        } else return 0;
    }
}