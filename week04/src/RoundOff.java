import java.util.Scanner;

public class RoundOff {
    public static void main(String[] args) {
        // add your code here
        System.out.print("Enter three integers: ");
        Scanner input = new Scanner(System.in);
        int first =  input.nextInt();
        int second = input.nextInt();
        int third = input.nextInt();
        //System.out.println(first + second + third);
        System.out.printf("Rounded sum is %d%n",roundSum(first,second,third));
    }

    private static int roundSum(int number1, int number2, int number3) {
        // add your code here
        int sum = number1 + number2 + number3;
        int check = sum % 10;
        if (check < 5 ){
            sum-=check;
        }else if (check >= 5){
            sum+=(10-check);
        }
        return sum;
    }
}