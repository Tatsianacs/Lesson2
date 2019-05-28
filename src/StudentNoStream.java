import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class StudentNoStream {

    public static void sortStudentsByAge(ArrayList<Student> students) {
        students.sort(Comparator.comparingInt(Student::getAge));
    }

    public static void printStudents(ArrayList<Student> students) {
        for (Student el : students) {
            System.out.println(el.getName() + " " + el.getSurname());
        }
    }

    public static ArrayList<Student> findStudentsByFirstLetterOfSurname(ArrayList<Student> students, char startOfSurname) {
        ArrayList<Student> foundStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getSurname().charAt(0) == startOfSurname) {
                foundStudents.add(student);
            }
        }
        return foundStudents;
    }

    public static float getAverageAge(ArrayList<Student> students) {
        int age = 0;
        for (Student student : students) {
            age += student.getAge();
        }
        return (float) (age / students.size());
    }


    public static HashMap<Integer, Student> createMapOfStudents(ArrayList<Student> students) {
        HashMap<Integer, Student> requiredMapOfStudents = new HashMap<>();
        for (Student student : students) {
            requiredMapOfStudents.put(student.getId(), student);
        }
        return requiredMapOfStudents;
    }

    public static void printStudentMap(HashMap<Integer, Student> mapOfStudents) {
        for (Map.Entry<Integer, Student> item : mapOfStudents.entrySet()) {
            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
        }
    }

    public static HashMap<Integer, Student> filterStudentsInMapById(HashMap<Integer, Student> students) {
        HashMap<Integer, Student> filteredStudents = new HashMap<>();
        for (Map.Entry<Integer, Student> item : students.entrySet()) {
            if (item.getKey() > 100) {
                filteredStudents.put(item.getKey(), item.getValue());
            }
        }
        return filteredStudents;
    }
}
