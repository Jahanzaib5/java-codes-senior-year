import java.util.Scanner;

public class Binary2Decimal {
    public static void main(String[] args) {
        // you may modify the code below, but try to preserve the program structure
        int binaryNumber;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        binaryNumber = console.nextInt();

        String a = "abc";
        //System.out.println(a.charAt(0));

        System.out.printf("Decimal of %d is %d", binaryNumber, binaryToDecimal(binaryNumber));
    }

    private static int binaryToDecimal(int binaryNumber) {
        // add your code below that implements the logic of the problem instructions.
        String temp = Integer.toString(binaryNumber);

        int sum = 0;
        int count = 0;
        //System.out.println("length"+temp.length());

        for (int i=(temp.length()-1); i>=0 ; i--){
            int a = Character.getNumericValue(temp.charAt(i));
            double b = Math.pow(2,count);
            double product = a*b;
            sum+=product;
            //sum+=((2^count) * Character.getNumericValue(temp.charAt(i)));
            count++;
        }

        //return decimalNumber;
        return sum;

    }
}