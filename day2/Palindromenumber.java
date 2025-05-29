package week1.day2;

public class Palindromenumber {
    public static void main(String[] args) {
        int rem = 121;
        int original = rem;
        int renum= 0;

        // Reverse the number using for loop
        for (int n = rem; n != 0; n /= 10) {
            int digit = n % 10;
            renum = renum * 10 + digit;
        }

        // Check if original number is same as reversed
        if (original == renum) {
            System.out.println(original + " is a palindrome number.");
        } else {
            System.out.println(original + " is not a palindrome number.");
        }
    }
}
