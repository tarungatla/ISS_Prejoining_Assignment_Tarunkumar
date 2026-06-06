package basics;


public class Strings{

    public static void main(String[] args) {

        // String creation
        String firstName = "Tarun";
        String lastName = "Gatla";

        // Concatenation
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);

        // Length
        System.out.println("Length of Full Name: " + fullName.length());

        // Character access
        System.out.println("First Character: " + fullName.charAt(0));
        System.out.println("Last Character: " + fullName.charAt(fullName.length() - 1));

        // Substring
        System.out.println("First Name: " + fullName.substring(0, 5));
        System.out.println("Surname: " + fullName.substring(6));

        // Equality
        String anotherName = "Tarun Gatla";
        System.out.println("Names are equal: " + fullName.equals(anotherName));

        // indexOf
        System.out.println("Index of 'Gatla': " + fullName.indexOf("Gatla"));

        // Replace
        String updatedName = fullName.replace("Tarun", "Rahul");
        System.out.println("After Replace: " + updatedName);

        // Case Conversion
        System.out.println("Uppercase: " + fullName.toUpperCase());
        System.out.println("Lowercase: " + fullName.toLowerCase());

        // Contains
        System.out.println("Contains 'Tarun': " + fullName.contains("Tarun"));

        // Trim
        String city = "  Mumbai  ";
        System.out.println("Before Trim: '" + city + "'");
        System.out.println("After Trim: '" + city.trim() + "'");
    }
}