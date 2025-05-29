package week1.day2;

public class ToFindFibonacci {

	public static void main(String[] args) {
		int n = 8, fN = 0, sN = 1;
	    System.out.println("Fibonacci Series till " + n + " terms:");
	  
	    for (int i = 0; i <n; i++) {
	    
	      System.out.println(fN);
	   
	      int nextTerm = fN + sN;
	      fN = sN;
	      sN = nextTerm;
	      
	    }
				
	}

}
