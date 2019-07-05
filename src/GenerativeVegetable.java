public class GenerativeVegetable extends Vegetable {

    private String seedsSize;

    GenerativeVegetable(String name, int calories, int protein, int carbs, int fat, boolean isImported, String seedsSize) {
        super(name, calories, protein, carbs, fat, isImported);
        this.seedsSize = seedsSize;
    }

    @Override
    public void printVegetableInfo() {
        System.out.printf("This is Generative Vegetable. Vegetable name is [%s], it has [%s] seeds. CPFC is [%d]/[%d]/[%d]/[%d] ",
                getVegetableName(), seedsSize, getVegetableCalories(), getVegetableProtein(), getVegetableFat(), getVegetableCarbs());
    }

}
