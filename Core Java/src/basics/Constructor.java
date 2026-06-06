package basics;

/**
 * Constructors:
 *
 * 1. Default Constructor
 * 2. Parameterized Constructor
 * 3. Constructor Overloading
 */

class Course {

    private int courseId;
    private String courseName;
    private double courseFee;

    // Default Constructor
    public Course() {

        courseId = 0;
        courseName = "Not Assigned";
        courseFee = 0.0;

        System.out.println("Default Constructor Called");
    }

    // Parameterized Constructor
    public Course(int courseId,
                  String courseName,
                  double courseFee) {

        this.courseId = courseId;
        this.courseName = courseName;
        this.courseFee = courseFee;

        System.out.println("Parameterized Constructor Called");
    }

    // Constructor Overloading
    public Course(int courseId,
                  String courseName) {

        this.courseId = courseId;
        this.courseName = courseName;
        this.courseFee = 5000;

        System.out.println("Overloaded Constructor Called");
    }

    public void displayDetails() {

        System.out.println("Course ID   : " + courseId);
        System.out.println("Course Name : " + courseName);
        System.out.println("Course Fee  : ₹" + courseFee);
        System.out.println();
    }
}

public class Constructor{

    public static void main(String[] args) {

        // Default Constructor
        Course course1 = new Course();
        course1.displayDetails();

        // Parameterized Constructor
        Course course2 =
                new Course(101,
                           "Java Programming",
                           12000);

        course2.displayDetails();

        // Overloaded Constructor
        Course course3 =
                new Course(102,
                           "Spring Boot");

        course3.displayDetails();
    }
}