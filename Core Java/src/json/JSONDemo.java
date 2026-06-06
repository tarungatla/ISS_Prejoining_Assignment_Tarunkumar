package json;


import org.json.JSONArray;
import org.json.JSONObject;

public class JSONDemo {

	public static void main(String[] args) {
		
		// Build the JSON object Manually
		JSONObject student = new JSONObject();
		student.put("id", 1);
		student.put("name", "Tarun");
		student.put("status", "active");
		
		JSONArray courses = new JSONArray();
		
		JSONObject course1 = new JSONObject();
        course1.put("subject", "Math");
        course1.put("grade", "A");

        JSONObject course2 = new JSONObject();
        course2.put("subject", "Science");
        course2.put("grade", "B");

        JSONObject course3 = new JSONObject();
        course3.put("subject", "History");
        course3.put("grade", "A");
        
        courses.put(course1);
        courses.put(course2);
        courses.put(course3);

        student.put("courses", courses);

        JSONObject studentData = new JSONObject();
        studentData.put("student", student);
        
        // Print complete JSON
        System.out.println("Student JSON:\n" + studentData.toString(2));
        
	}

}