package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int num=7;
		if(IsPrimeNumber(num)) {
			System.out.println(num + "Is Prime");
		}
			else
			{
				System.out.println(num + "Not Prime");
			}
		
		
	}

	private static boolean IsPrimeNumber(int num) {
		{
		if(num<=1)
		return false;
		}
		{
		for (int i = 2; i <= Math.sqrt(num); i++)
            if (num % i == 0)
                return false;

        return true;
	}
}
}

	