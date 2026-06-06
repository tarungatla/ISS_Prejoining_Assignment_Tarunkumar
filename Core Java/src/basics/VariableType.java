package basics;


//Variable Type
//1. Local Variable - Declared inside method, constructor or block accessible within that scope
//2. Instance Variable - every instance has its own copy of variable
//3. Static Variable - used to create constants and shared among all instance of class


public class VariableType {
	
	// Instance Variable - unique per object
	int instanceVal = 0;
	
	// Static Variable – shared among all instances
	static int staticVal = 4;
	
	public static void main(String[] args) {
		
		// Demonstrating Instance Variables
		VariableType obj1 = new VariableType();
		// changing value of instance variable of obj1
		obj1.instanceVal = 2;
		System.out.println("instanceVal value of obj1 :" + obj1.instanceVal);
		
		VariableType obj2 = new VariableType();
		System.out.println("instanceVal value of obj2 :" + obj2.instanceVal);
		
		// We can see value of instanceVal doesn't change for obj2 unless we do it explicitly
		System.out.println("Instance variables are separate for each object.\n");
		
		
		if(true) {
			
			// Block scope variable
			int localVal;
			localVal = 0;
			System.out.println("Inside If block " + localVal);
		}
		
		System.out.println("Outside If block unable to access localVal");
		// System.out.println(localVal);  // will give error localVal is local scope variable

		// Static Variable
		
		// belongs to a class and not the object
		// can be accessed without making any object
		System.out.println("Accessing Static varaible using VariableType.staticVal: "+ VariableType.staticVal);
		System.out.println("Static variable via obj1: " + obj1.staticVal);
		System.out.println("Static variable via obj2: " + obj2.staticVal);

		// Changing static value via obj1
		obj1.staticVal = 10;
		System.out.println("\nAfter obj1 changes staticVal:");
		System.out.println("Static via obj1: " + obj1.staticVal);
		System.out.println("Static via obj2: " + obj2.staticVal);
		System.out.println("Static via class: " + VariableType.staticVal);
		
	}
}