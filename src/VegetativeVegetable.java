public class VegetativeVegetable extends Vegetable {

    private String leafSize;

    VegetativeVegetable(String name, int calories, int protein, int carbs, int fat, boolean isImported, String leafSize) {
        super(name, calories, protein, carbs, fat, isImported);
        this.leafSize = leafSize;
    }

    @Override
    public void printVegetableInfo() {
        System.out.printf("I am Vegetative Vegetable. Vegetable name is [%s], it has [%s] leaf. CPFC is [%d]/[%d]/[%d]/[%d] ", getVegetableName(), leafSize, getVegetableCalories(), getVegetableProtein(), getVegetableFat(), getVegetableCarbs());
    }

}
