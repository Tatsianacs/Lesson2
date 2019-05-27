public class VegetativeVegetable extends Vegetable {

    private String leafSize;

    VegetativeVegetable(String name, int calories, int protein, int carbs, int fat, boolean isImported, String leafSize) {
        super(name, calories, protein, carbs, fat, isImported);
        this.leafSize = leafSize;
    }


    @Override
    public void printVegetableInfo() {
        System.out.println("I am Vegetative Vegetable");
        System.out.printf("Vegetable name is [%s], it has [%s] leaf. CPFC is [%d]/[%d]/[%d]/[%d] ", getVegetableName(), leafSize, getVegetableCalories(), getVegetableProtein(), getVegetableFat(), getVegetableCarbs());
    }

    public void eatVegetativeVegetable() {
        System.out.println("Used in food: shoots, leaves, stems, roots, rhizomes, tubers");
    }
}
