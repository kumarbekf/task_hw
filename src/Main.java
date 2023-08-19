import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Student> studentsByName = new TreeMap<>();
        TreeMap<Integer, Student> studentsById = new TreeMap<>();

        studentsByName.put("John Doe", new Student(1, "John", "Doe", 20));
        studentsByName.put("Jane Smith", new Student(2, "Jane", "Smith", 22));
        studentsByName.put("Mike Johnson", new Student(3, "Mike", "Johnson", 21));

        studentsById.put(1, new Student(1, "John", "Doe", 20));
        studentsById.put(2, new Student(2, "Jane", "Smith", 22));
        studentsById.put(3, new Student(3, "Mike", "Johnson", 21));

        studentsByName.keySet().forEach(name -> System.out.println(studentsByName.get(name).getName()));

        studentsById.keySet().forEach(id -> System.out.println(studentsById.get(id).getLastname()));

        studentsByName.remove("Jane Smith");

        studentsById.remove(2);

        Course newCourse = new Course(1, "Math");

        studentsByName.values().forEach(student -> student.setName("New Student"));

        studentsById.values().forEach(student -> student.setLastname("New Last Name"));
    }
    }
