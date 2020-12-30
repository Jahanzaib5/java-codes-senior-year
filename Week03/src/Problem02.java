import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a dividend: ");
        int divident = input.nextInt();
        System.out.print("Enter a divisor : ");
        int divisor = input.nextInt();

        if(divisor == 0){
            System.out.println("Incorrect input!");
        }else{
            System.out.println("Quotient is: "+ (divident/divisor));
        }

    }

}
