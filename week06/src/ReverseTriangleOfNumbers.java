import java.util.InputMismatchException;
import java.util.Scanner;

public class ReverseTriangleOfNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N: ");
        try {
            int num = input.nextInt();
            //int count = num;
            //int count2 = 0;
            for (int i=num; i>0; i-- ){
                int count2 = num;
                while (count2 > i){
                    System.out.print("  ");
                    count2--;
                }

                int count3 = 1;
                while (count3 <= i){
                    if (count3==i){
                        System.out.print(count3);
                    }else {
                        System.out.print((count3)+" ");
                    }
                    count3++;

                    //System.out.println();
                }

                System.out.println();

            }
        }catch (InputMismatchException e){
            System.out.println("Incorrect input");
        }
    }
}
