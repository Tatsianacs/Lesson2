public class GenerativeVegetable extends Vegetable {

    private String seedsSize;

    GenerativeVegetable(String name, int calories, int protein, int carbs, int fat, boolean isImported, String seedsSize) {
        super(name, calories, protein, carbs, fat, isImported);
        this.seedsSize = seedsSize;
    }


    @Override
    public void printVegetableInfo() {
        System.out.println("I am Generative Vegetable");
        System.out.printf("Vegetable name is [%s], it has [%s] seeds. CPFC is [%d]/[%d]/[%d]/[%d] ", getVegetableName(), seedsSize, getVegetableCalories(), getVegetableProtein(), getVegetableFat(), getVegetableCarbs());
    }

    public void eatGenerativeVegetable() {
        System.out.println("Used in food: fruits, seeds, young ovaries");
    }
}
