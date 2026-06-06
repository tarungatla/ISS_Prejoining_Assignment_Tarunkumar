package accessmodifier;

import utilities.Course;

public class AccessModifier{

    public static void main(String[] args) {

        OnlineCourse course = new OnlineCourse();

        // Public
        System.out.println(course.courseName);

        // Default (same package)
        System.out.println(course.trainer);

        // Protected (same package)
        course.getDuration();

        // Private through getter
        System.out.println(course.getCourseFee());

        

    }
}