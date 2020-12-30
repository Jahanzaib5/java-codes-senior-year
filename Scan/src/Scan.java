import java.util.Scanner;

public class Scan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first digit: ");
        int num1 = input.nextInt();

        System.out.println("Enter the second digit: ");
        int num2 = input.nextInt();

        int sum = num1+num2;
        System.out.printf("The sum of the two digits is : %d%n", sum);
    }
}
