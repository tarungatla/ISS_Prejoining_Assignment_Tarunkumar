package collection;

import java.util.*;

public class CollectionPrimitive{

    public static void main(String[] args) {

        // LIST
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20); // duplicates allowed

        System.out.println("List:");
        System.out.println(numbers);

        // SET
        Set<Integer> uniqueNumbers = new HashSet<>();

        uniqueNumbers.add(10);
        uniqueNumbers.add(20);
        uniqueNumbers.add(30);
        uniqueNumbers.add(20); // duplicate ignored

        System.out.println("\nSet:");
        System.out.println(uniqueNumbers);

        // MAP
        Map<Integer, String> employees = new HashMap<>();

        employees.put(101, "Tarun");
        employees.put(102, "Rahul");
        employees.put(103, "Amit");

        System.out.println("\nMap:");

        for(Integer id : employees.keySet()) {
            System.out.println(
                    "Id = " + id +
                    ", Name = " + employees.get(id));
        }
    }
}