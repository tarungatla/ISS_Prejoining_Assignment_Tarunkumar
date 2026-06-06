package basics;


/** Loop Control
 * 
 * 	1. for loop - executes a block of code specific number of times
 * 	2. while loop - repeatedly executes a code while condition is true
 * 	3. do-while loop - Executes code at least once before checking the condition
 * 	4. for-each loop - Simplified iteration over arrays/collections
 * 	5. loop control keywords -
 * 			"break" - exits the loop
 * 			"continue" - skip the loop to next iteration
 */
public class LoopControl {

	public static void main(String[] args) {

		
		// 1. For loop
		// print first 5 natural numbers
		
		System.out.println("For Loop:");
		for(int i=1; i<=5; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
		
		
		// 2. while loop
		int num = 6;
		int count = 0;
		
		System.out.println("While Loop:");
		while(count < num) {
			System.out.print(count + " ");
			count++;
		}

		System.out.println("\n");
		
		
		// 3. Do-While loop
		System.out.println("Do-While Loop:");
		
		count = 6;
		
		do {
			System.out.println(count + " ");
		}while(count < num); // even though the condition is false still loop will run once
		
		System.out.println("\n");
		
		// 4. For-each loop
		// iterate elements of List or Array
		
		System.out.println("For-each Loop:");
		
		String[] students = {"Arjun", "Parth", "Dhananjay"};
		
		for(String student: students) {
			System.out.print(student + " ");
		}
		System.out.println("\n");
		
		
		// 5. Loop control keywords
		// print first 5 divisible numbers of 6
		System.out.println("Loop Control (Break & Continue):");
		
		count=0;
		num = 0;
		while(true) {
			num++;
			
			// using continue to skip if number not divisible
			if(num%3 != 0) {
				continue;
			}
			else {
				System.out.print(num + " ");
				count++;
			}
			
			// using break
			if(count == 5) {
				break;
			}
		}
 	}

}