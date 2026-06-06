package accessmodifier;

import utilities.Course;

/**
 * Child class in a different package.
 */
public class OnlineCourse extends Course {

	String trainer = "Tarun";
	
	public void getDuration() {
        // Accessible because protected
        System.out.println("Duration: " + duration);
	}
    public void displayDetails() {


        // Accessible because public
        System.out.println("Course Name: " + courseName);

        // Private accessed through getter
        System.out.println("Course Fee: " + getCourseFee());

        /*
         * Not Accessible
         * trainer has default access
         */
//         System.out.println(trainer);
    }
}