import java.util.Scanner;

public class Decimal2Binary {
    public static void main(String[] args) {
        // you may modify the code below, but try to preserve the program structure
        int decimalNumber;
        Scanner console = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        decimalNumber = console.nextInt();

        System.out.printf("Binary of %d is %s", decimalNumber, decimalToBinary(decimalNumber));
    }

    private static String decimalToBinary(int decimalNumber) {
        // add your code below that implements the logic of the problem instructions.

        int a[] = new int[8];

        int index = 0;

        while (decimalNumber > 0){
            int remainder = decimalNumber%2;
            a[index] = remainder;
            decimalNumber=decimalNumber/2;
            index++;
        }

        String output="";

        for(int i=(a.length-1); i>=0; i--){
            //System.out.print(a[i]);
            output+=a[i];
        }

        //int result = Integer.parseInt(output);
        //System.out.println(result);
        //System.out.println(output);

        //System.out.println();
        //System.out.println(output);


        //return binaryNumber;
        return output;
    }
}