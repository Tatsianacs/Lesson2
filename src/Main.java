import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Task 1
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

//        // Task 2
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

        System.out.println("-----Sort students-----");
        StudentNoStream.sortStudentsByAge(groupOfStudents);
        StudentStream.printStudents(groupOfStudents);

        System.out.println("-----Filter students who has T in surname start-----");
        ArrayList<Student> requiredStudents = StudentNoStream.findStudentsByFirstLetterOfSurname(groupOfStudents, 'T');
        StudentNoStream.printStudents(requiredStudents);

        System.out.println("-----Average student age is " + StudentNoStream.getAverageAge(groupOfStudents));

        System.out.println("-----Map is created from the list and filtered-----");
        StudentNoStream.createMapOfStudents(groupOfStudents);
        HashMap<Integer, Student> filteredMapOfStudents = StudentNoStream.filterStudentsInMapById(StudentNoStream.createMapOfStudents(groupOfStudents));
        StudentNoStream.printStudentMap(filteredMapOfStudents);

//        // Task 3
        System.out.println("-----Sort students-----");
        ArrayList<Student> sortedStudentList = StudentStream.sortStudentsByAge(groupOfStudents);
        StudentStream.printStudents(sortedStudentList);

        System.out.println("-----Filter students who has T in surname start-----");
        ArrayList<Student> filteredStudentList = StudentStream.findStudentsByFirstLetterOfSurname(groupOfStudents, 'T');
        StudentStream.printStudents(filteredStudentList);

        System.out.println("-----Average student age is " + StudentStream.getAverageAge(groupOfStudents));

        System.out.println("-----Map is created from the list-----");
        Map<Integer, Student> mapOfStudents = StudentStream.createMapOfStudents(groupOfStudents);
        StudentStream.printStudentMap(mapOfStudents);

        System.out.println("-----Map is filtered-----");
        Map<Integer, Student> filteredMapOfStudentsStream = StudentStream.filterStudentsInMapById(mapOfStudents);
        StudentStream.printStudentMap(filteredMapOfStudentsStream);

//        // Task 4
        ArrayList<Integer> arrList = ListComparison.createArrayList();
        LinkedList<Integer> linkedList = ListComparison.createLinkedList();
        long timeForArrayListAddOperation = ListComparison.getTimeToAddToArrayList(arrList);
        long timeForLinkedListAddOperation = ListComparison.getTimeToAddToLinkedList(linkedList);
        long timeDifferenceForAdd = Math.abs(timeForArrayListAddOperation - timeForLinkedListAddOperation);
        System.out.printf("-----Time to add 1000 elements: \n for ArrayList is [%d] \n for LinkedList is [%d] \n difference is [%d] nano seconds \n",
                timeForArrayListAddOperation, timeForLinkedListAddOperation, timeDifferenceForAdd);

        long timeForArrayListRemoveOperation = ListComparison.getTimeToRemoveFromArrayList(arrList);
        long timeForLinkedListRemovedOperation = ListComparison.getTimeToRemoveFromLinkedList(linkedList);
        long timeDifferenceForRemove = Math.abs(timeForArrayListAddOperation - timeForLinkedListAddOperation);
        System.out.printf("-----Time to remove 1000 elements: \n for ArrayList is [%d] \n for LinkedList is [%d] \n difference is [%d] nano seconds \n",
                timeForArrayListRemoveOperation, timeForLinkedListRemovedOperation, timeDifferenceForRemove);

        long timeForArrayListSearchOperation = ListComparison.getTimeToSearchFromArrayList(arrList);
        long timeForLinkedListSearchOperation = ListComparison.getTimeToSearchFromLinkedList(linkedList);
        long timeDifferenceForSearch = Math.abs(timeForArrayListSearchOperation - timeForLinkedListSearchOperation);
        System.out.printf("-----Time to search for 1000 elements: \n for ArrayList is [%d] \n for LinkedList is [%d] \n difference is [%d] nano seconds \n",
                timeForArrayListSearchOperation, timeForLinkedListSearchOperation, timeDifferenceForSearch);
    }


}
