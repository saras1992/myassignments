package week3.day1;

public class FindMissingElement {
	
	    public static void main(String[] args) {
	        // Input array
	        int[] numbers = {1, 4, 3, 2, 8, 6, 7};

	        // Find the expected sum from 1 to 8 (since max value is 8)
	        int n = 8;
	        int expectedSum = n * (n + 1) / 2;

	        // Calculate the actual sum of the array
	        int actualSum = 0;
	        for (int num : numbers) {
	            actualSum += num;
	        }

	        // The missing number is the difference
	        int missingNumber = expectedSum - actualSum;

	        // Print the missing number
	        System.out.println("Missing number is: " + missingNumber);
	    }
	}



