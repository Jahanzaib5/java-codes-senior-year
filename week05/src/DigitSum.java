import java.util.InputMismatchException;
import java.util.Scanner;
import java.math.BigInteger;


public class DigitSum {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            //long numb = Math.abs(input.nextInt());
            BigInteger num = input.nextBigInteger();
            BigInteger num3 = num.abs();


            String numb = num3.toString();

            if (numb.length() > 10){
                System.out.println("error");
            }else {
                System.out.println(digitSum(numb));
            }
        }catch (InputMismatchException e){
            System.out.println("error");
        }
    }

    public static int digitSum(String numb){
        int result = 0;
        for (int i=0; i<numb.length(); i++){
            result+=Integer.parseInt(String.valueOf(numb.charAt(i)));
        }
        return result;
    }


}
