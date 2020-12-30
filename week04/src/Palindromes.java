import java.math.BigInteger;
import java.util.Scanner;

/* A palindromic number or palindrome number is a number that remains the same when its digits are reversed.
Like 16461. Write a program that decides whether a given int number is a palindrome or not. Do not use strings and
string functions or arrays and array functions!!!

Sample input / output:
Enter a number: 12345
This number is not a palindrome

*/

public class Palindromes {
    public static void main(String args[]){
        // add your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        BigInteger num = input.nextBigInteger();
        if (isPalindrome2(num)){
            System.out.println("This number is a palindrome");
        }else {
            System.out.println("This number is not a palindrome");
        }


    }

    private static boolean isPalindrome2(BigInteger num) {
    // add your code here
        BigInteger reverse = new BigInteger("0");
        BigInteger check = num;
        BigInteger divide = new BigInteger("10");
        while (num.compareTo(BigInteger.ZERO) != 0){
            BigInteger remainder = num.remainder(divide);
            reverse = reverse.multiply(divide).add(remainder);
            num = num.divide(divide);
        }
        //System.out.println("che: " + check);
        //System.out.println("rev: "+ reverse);

        if (check.equals(reverse)){
            return true;
        }else {
            return false;
        }
}
}