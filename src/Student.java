public class Student {

    private int id;
    private String name;
    private String surname;
    private int age;

    Student(int id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int getAge() {return age;}

    public String getName() {return name;}

    public String getSurname() {return surname;}

    public int getId() {return id;}

}
