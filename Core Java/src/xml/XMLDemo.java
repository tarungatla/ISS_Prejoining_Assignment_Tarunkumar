package xml;

import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import java.io.File;


public class XMLDemo {

	public static void main(String[] args) {
		
		
		try {
			File file = new File("src/xml/student.xml");
			
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            
            Document doc = dBuilder.parse(file);
            doc.getDocumentElement().normalize();
            
            // Root element
            Element student = doc.getDocumentElement();
            System.out.println("Root Element: " + student.getNodeName());
            
            // Access simple fields
            String name = student.getElementsByTagName("name").item(0).getTextContent();
            String age = student.getElementsByTagName("age").item(0).getTextContent();
            String department = student.getElementsByTagName("department").item(0).getTextContent();
            
            System.out.println("Name:" + name);
            System.out.println("Age: " + age);
            System.out.println("Department: " + department);
			
        
            
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}