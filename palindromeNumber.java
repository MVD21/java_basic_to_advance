import java.util.*;

class palindromeNumber {
    public boolean isPalindrome(int x) {
        // 1. Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }

        // 2. Reverse the number
        int n = x;
        long rev = 0; // Use long to prevent overflow for large numbers
        
        while (n > 0) {
            int lastdi = n % 10;
            rev = (rev * 10) + lastdi;
            n /= 10;
        }

        // 3. Compare original with reversed
        // This returns true if they match, false otherwise
        return x == rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter A no.:- ");
        int x = sc.nextInt();

        palindromeNumber pl = new palindromeNumber();
        
        // We must print the result to see it in the console
        boolean result = pl.isPalindrome(x);
        System.out.println("Is " + x + " a palindrome? " + result);
        
        sc.close();
    }
}