import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StudentStream {

    public static ArrayList<Student> sortStudentsByAge(ArrayList<Student> students) {
        ArrayList<Student> sortedStudentList = students.stream().sorted(Comparator.comparingInt(Student::getAge)).collect(Collectors.toCollection(ArrayList::new));
        return sortedStudentList;
    }

    public static void printStudents(ArrayList<Student> students) {
        students.stream().forEach(el -> System.out.println(el.getName() + " " + el.getSurname()));
    }

    public static ArrayList<Student> findStudentsByFirstLetterOfSurname(ArrayList<Student> students, char startOfSurname) {
        ArrayList<Student> foundStudents = students.stream().filter(el -> Character.toLowerCase(el.getSurname().charAt(0)) == Character.toLowerCase(startOfSurname)).collect(Collectors.toCollection(ArrayList::new));
        return foundStudents;
    }

    public static float getAverageAge(ArrayList<Student> students) {
        int sum = students.stream().map(x -> x.getAge()).reduce(0, Integer::sum);
        return (float) (sum / students.size());
    }


    public static Map<Integer, Student> createMapOfStudents(ArrayList<Student> students) {
        Map<Integer, Student> requiredMapOfStudents = students.stream().collect(Collectors.toMap(c -> c.getId(), c -> c));
        return requiredMapOfStudents;
    }

    public static void printStudentMap(Map<Integer, Student> mapOfStudents) {
        mapOfStudents.entrySet().stream().forEach(item -> System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue().getName()));
    }

    public static Map<Integer, Student> filterStudentsInMapById(Map<Integer, Student> students) {
        Map<Integer, Student> filteredStudents = students.entrySet().stream()
                .filter(el -> el.getKey() > 100)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        return filteredStudents;
    }
}
