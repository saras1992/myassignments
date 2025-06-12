package week3.day1;

public class FindIntersection {

	public static void main(String[] args) {
		int a[]= {3,2,11,4,6,7};
		int b[]= {1,2,4,8,9,7};
		 // Loop through first array
        for (int i = 0; i < a.length; i++) {
            // Nested loop through second array
            for (int j = 0; j <b.length; j++) {
                // Compare both arrays
                if (a[i] == b[j]) {
                    // Print value from first array when match found
                    System.out.println("Matching value: " + a[i]);
                }
                
            }
            
        }
	}
}
