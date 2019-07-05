import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Salad {
    private String name;
    ArrayList<Vegetable> ingredients = new ArrayList<Vegetable>();
    private int saladCalories = 0;

    Salad(String name, Vegetable mainIngredient, Vegetable... ingredient) {
        this.name = name;
        this.ingredients.add(mainIngredient);
        this.saladCalories += mainIngredient.getVegetableCalories();
        for (Vegetable specificVeg : ingredient) {
            this.saladCalories += specificVeg.getVegetableCalories();
            this.ingredients.add(specificVeg);
        }
    }

    public String getSaladName() {
        return name;
    }

    public Salad setSaladName(String name) {
        this.name = name;
        return this;
    }

    public int getSaladCalories() {
        return saladCalories;
    }

    public void addIngredientToSalad(Vegetable ing) {
        System.out.println("New ingredient is added.");
        this.ingredients.add(ing);
        this.saladCalories += ing.getVegetableCalories();
    }

    public void removeIngredientFromSalad(String name) {
        Iterator itr = ingredients.iterator();
        while (itr.hasNext()) {
            Vegetable veg = (Vegetable) itr.next();
            String vegNameToBeRemoved = veg.getVegetableName();
            if (vegNameToBeRemoved.equals(name)) {
                this.saladCalories -= veg.getVegetableCalories();
                itr.remove();
                System.out.println("Ingredient is removed");
            }
        }
    }

    public void printSaladInfo() {
        System.out.printf("This is salad with the name [%s]. It has calories: [%d]. Now the salad consists of the following ingredients: \n", name, saladCalories);
        for (Vegetable specificVeg : ingredients) {
            System.out.println(specificVeg.getVegetableName());
        }
    }

    public void sortVegetablesInSalad() {
        System.out.println("Vegetables are sorted in Salad.");
        ingredients.sort(Comparator.comparingInt(Vegetable::getVegetableCalories).reversed());
    }

    public void findAndPrintIngredientByNutrition(int minCal, int maxCal, int maxCarbs) {
        ingredients.stream()
                .filter(el -> el.getVegetableCalories() >= minCal && el.getVegetableCalories() <= maxCal && el.getVegetableCarbs() <= maxCarbs)
                .forEach(el -> System.out.println("Required vegetable is " + el.getVegetableName()));

    }
}
