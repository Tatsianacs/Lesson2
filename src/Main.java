public class Main {

    public static void main(String[] args) {

        VegetativeVegetable broccoli = new VegetativeVegetable("broccoli", 34, 3, 7, 0, true, "no");

        VegetativeVegetable onion = new VegetativeVegetable("onion", 40, 1, 9, 0, false, "small");

        GenerativeVegetable pumpkin = new GenerativeVegetable("pumpkin", 26, 1, 7, 0, false, "average");

        GenerativeVegetable tomato = new GenerativeVegetable("tomato", 18, 1, 4, 0, true, "small");

        GenerativeVegetable corn = new GenerativeVegetable("corn", 96, 3, 21, 2, true, "small");

        Salad belarusianSalad = new Salad("Healthy Diet", broccoli, tomato, onion, pumpkin);
        belarusianSalad.printSaladInfo();

        belarusianSalad.addIngredientToSalad(corn);
        belarusianSalad.printSaladInfo();

        belarusianSalad.removeIngredientFromSalad("broccoli");
        belarusianSalad.printSaladInfo();

        belarusianSalad.sortVegetablesInSalad();
        belarusianSalad.printSaladInfo();

        belarusianSalad.findAndPrintIngredientByNutrition(20, 40, 7);
    }
}
