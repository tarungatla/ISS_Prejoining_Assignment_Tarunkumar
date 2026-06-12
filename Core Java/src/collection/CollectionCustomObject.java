package collection;

import java.util.*;


class Student implements Comparable<Student> {

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

    // Comparable -> Sort by ID
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Student student = (Student) obj;

        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

class StudentNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

public class CollectionCustomObject {

    public static void main(String[] args) {

        // Primitive List

        List<Integer> numbers =
                new ArrayList<>(Arrays.asList(50, 10, 40, 20, 30));

        System.out.println("Original Integer List:");
        System.out.println(numbers);

        Collections.sort(numbers);

        System.out.println("\nSorted Integer List:");
        System.out.println(numbers);

        // Student Objects

        Student s1 = new Student(103, "Tarun");
        Student s2 = new Student(101, "Rahul");
        Student s3 = new Student(102, "Amit");

        // List<Student>

        List<Student> studentList =
                new ArrayList<>();

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        System.out.println("\nOriginal Student List:");

        for (Student student : studentList) {
            System.out.println(student);
        }

        // Sort using Comparable (ID)

        Collections.sort(studentList);

        System.out.println("\nStudents Sorted By ID (Comparable):");

        for (Student student : studentList) {
            System.out.println(student);
        }

        // Sort using Comparator (Name)

        Collections.sort(
                studentList,
                new StudentNameComparator()
        );

        System.out.println("\nStudents Sorted By Name (Comparator):");

        for (Student student : studentList) {
            System.out.println(student);
        }

        // Set<Student>

        Set<Student> studentSet =
                new HashSet<>();

        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);

        System.out.println("\nSet<Student>");

        for (Student student : studentSet) {
            System.out.println(student);
        }

        // Map<Integer, Student>

        Map<Integer, Student> studentMap =
                new HashMap<>();

        studentMap.put(s1.getId(), s1);
        studentMap.put(s2.getId(), s2);
        studentMap.put(s3.getId(), s3);

        System.out.println("\nMap<Integer, Student>");

        for (Integer id : studentMap.keySet()) {
            System.out.println(id + " -> " + studentMap.get(id));
        }
    }
}