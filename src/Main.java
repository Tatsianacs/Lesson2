import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

//        VegetativeVegetable broccoli = new VegetativeVegetable("broccoli", 34, 3, 7, 0, true, "no");
//
//        VegetativeVegetable onion = new VegetativeVegetable("onion", 40, 1, 9, 0, false, "small");
//
//        GenerativeVegetable pumpkin = new GenerativeVegetable("pumpkin", 26, 1, 7, 0, false, "average");
//
//        GenerativeVegetable tomato = new GenerativeVegetable("tomato", 18, 1, 4, 0, true, "small");
//
//        GenerativeVegetable corn = new GenerativeVegetable("corn", 96, 3, 21, 2, true, "small");
//
//        Salad belarusianSalad = new Salad("Healthy Diet", broccoli, tomato, onion, pumpkin);
//        belarusianSalad.printSaladInfo();
//
//        belarusianSalad.addIngredientToSalad(corn);
//        belarusianSalad.printSaladInfo();
//
//        belarusianSalad.removeIngredientFromSalad("broccoli");
//        belarusianSalad.printSaladInfo();
//
//        belarusianSalad.sortVegetablesInSalad();
//        belarusianSalad.printSaladInfo();
//
//        belarusianSalad.findAndPrintIngredientByNutrition(20, 40, 7);


        ArrayList<Student> groupOfStudents = new ArrayList<>();
        groupOfStudents.add(new Student(12, "Tatsiana", "Masiukevich", 31));
        groupOfStudents.add(new Student(124, "Svetlana", "Mironova", 18));
        groupOfStudents.add(new Student(125, "Marina", "Korolenko", 16));
        groupOfStudents.add(new Student(126, "Stepan", "Volski", 18));
        groupOfStudents.add(new Student(5, "Yan", "Tester", 28));
        groupOfStudents.add(new Student(101, "Yana", "Zazulinskaya", 25));
        groupOfStudents.add(new Student(129, "Dmitry", "Kulevich", 22));
        groupOfStudents.add(new Student(99, "Pavel", "Sobchanka", 32));
        groupOfStudents.add(new Student(100, "Vlad", "Lobakh", 25));
        groupOfStudents.add(new Student(122, "Tatsiana", "Tester", 42));

//        Task2.sortStudentsByAge(groupOfStudents);
//
//        ArrayList<Student> requiredStudents = Task2.findStudentsByFirstLetterOfSurname(groupOfStudents, 'T');
//        Task2.printStudents(requiredStudents);
//
//        System.out.println(Task2.getAverageAge(groupOfStudents));
//
//        Task2.createMapOfStudents(groupOfStudents);
//        HashMap<Integer, Student> filteredMapOfStudents = Task2.filterStudentsInMapById(Task2.createMapOfStudents(groupOfStudents));
//        Task2.printStudentMap(filteredMapOfStudents);

        // Task3

        ArrayList<Student> sortedStudentList = Task3.sortStudentsByAge(groupOfStudents);
        Task3.printStudents(sortedStudentList);

        ArrayList<Student> filteredStudentList = Task3.findStudentsByFirstLetterOfSurname(groupOfStudents, 'T');
        Task3.printStudents(filteredStudentList);

        System.out.println(Task3.getAverageAge(groupOfStudents));

        Map<Integer, Student> mapOfStudents = Task3.createMapOfStudents(groupOfStudents);
        Task3.printStudentMap(mapOfStudents);

        System.out.println();
        Map<Integer, Student> filteredMapOfStudents = Task3.filterStudentsInMapById(mapOfStudents);
        Task3.printStudentMap(filteredMapOfStudents);

    }


}
