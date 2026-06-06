package basics;

//Array - fixed-size sequential collection of elements of the same data type

public class Arrays {
	
	// Method to print array using for loop
	public static void printArray(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print(" " + array[i] + " ");
		}
		System.out.println("");
	}

	// Method to print 2D array
 public static void print2DArray(int[][] matrix) {
     for (int i=0; i<matrix.length; i++) {
         for (int j=0; j<matrix[0].length; j++) {
             System.out.print(matrix[i][j] + " ");
         }
         System.out.println();
     }
 }
	
	public static void main(String[] args) {
	
		// Initialize Array 
		int[] array1 = new int[] {1,2,3,4};

		// Accessing elements in array
		System.out.println("First element: " + array1[0]); // first element
        System.out.println("Last element: " + array1[array1.length - 1]); // last element
		
        // 2-D array
	    int[][] matrix = {
	    	{1,2},
	    	{3,4}
	    };
	    
	    // print 2-D Array
	    System.out.println("2D Array:");
	    print2DArray(matrix);


	}

}