
import java.util.Scanner;

public class Primes {
    public static void main(String[] args)
    {
        // write your code here
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num <= 0){
            System.out.println("Enter a valid number!");
        }else {
            for (int i=1; i<=num; i++){
                if (isPrime(i)){
                    System.out.print(i+" ");
                }
            }
        }


    }

    // The method that determines whether a number is a prime or not a prime.
    public static boolean isPrime(int num) {
        // write your code here
        if (num < 2) {
            return false;
        }
        for (int i=2;i <= Math.sqrt(num); i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}