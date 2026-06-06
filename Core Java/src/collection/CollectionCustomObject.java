package collection;

import java.util.*;

/**
 * Student custom object.
 */
class Student {

    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{id="
                + id +
                ", name='"
                + name +
                "'}";
    }

    // Required for Set uniqueness
    @Override
    public boolean equals(Object obj) {

        if(this == obj)
            return true;

        if(obj == null ||
                getClass() != obj.getClass())
            return false;

        Student student = (Student) obj;

        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

public class CollectionCustomObject{

    public static void main(String[] args) {

        Student s1 = new Student(101, "Tarun");
        Student s2 = new Student(102, "Rahul");
        Student s3 = new Student(103, "Amit");

        // LIST<Student>

        List<Student> studentList =
                new ArrayList<>();

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        System.out.println("List<Student>");

        for(Student student : studentList) {
            System.out.println(student);
        }

        // SET<Student>

        Set<Student> studentSet =
                new HashSet<>();

        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);

        System.out.println("\nSet<Student>");

        for(Student student : studentSet) {
            System.out.println(student);
        }

        // MAP<Integer, Student>

        Map<Integer, Student> studentMap =
                new HashMap<>();

        studentMap.put(s1.getId(), s1);
        studentMap.put(s2.getId(), s2);
        studentMap.put(s3.getId(), s3);

        System.out.println("\nMap<Integer, Student>");

        for(Integer id : studentMap.keySet()) {
            System.out.println(
                    id + " -> "
                    + studentMap.get(id));
        }
    }
}