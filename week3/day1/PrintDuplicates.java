package week3.day1;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		int num[]={2, 5, 7, 7, 5, 9, 2, 3};
		
		int printdup = num.length;// this is length of the array
		
		Arrays.sort(num);// array sorting
		
		System.out.println("Print the duplicate");
		
		for(int i=0; i<printdup-1; i++)
		{
		//System.out.println(num[i]);
		
		if(num[i]==num[i+1])// used for checking the duplicate
		{
			System.out.println(num[i]);
		}
			
		}
			
			
	}

}
