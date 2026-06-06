package oop;


//Compile Time Polymorphism - it is implemented by method overloading
//Also known as static polymorphism

public class CompiletimePolymorphism {

	// Overloaded method to add 2 integer
	public int addition(int num1, int num2) {
		return num1+num2;
	}
	
	// Overloaded method to add 3 integer
	public int addition(int num1, int num2, int num3) {
		return num1+num2+num3;
	}
	
	// overloaded method to add 2 double
	public double addition(double num1, double num2) {
		return num1+num2;
	}
	
	public static void main(String[] args) {
		
		
		CompiletimePolymorphism obj = new CompiletimePolymorphism();
		
		
		System.out.println("Addition with 2 ineger parameters "+ obj.addition(10,20));
		
		System.out.println("Addition with 3 ineger parameters "+obj.addition(10,20, 30));
		
		System.out.println("Addition with 2 double parameters "+obj.addition(10.24,20.36));

	}

}