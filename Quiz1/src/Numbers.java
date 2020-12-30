import java.util.InputMismatchException;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        try {
            int number = Math.abs(input.nextInt());
            String second = "";
            String third = "";
            second+=number;
            second+=number;

            third+=number;
            third+=number;
            third+=number;
            int sec2 = Integer.parseInt(second);
            int thi3 = Integer.parseInt(third);

            int result = number + sec2 + thi3;
            //System.out.println(result);
            System.out.printf("%d + %d%d + %d%d%d = %d%n", number, number,number,number,number,number, result);
        }
        catch(InputMismatchException e) {
            System.out.println("error");

        }


    }

}
