import java.util.Scanner;

public class Triangle07 {
    public static void main(String[] args){
        System.out.println();
        Scanner input = new Scanner(System.in);
        int side1 = input.nextInt();
        int side2 = input.nextInt();
        int side3 = input.nextInt();
        double sum = (side1+side2+side3);

        if(side1 == 0 || side2 == 0 || side3== 0){
            System.out.println("It is not a valid Triangle.");
        }else {
            if(sum == 180.0){
                System.out.println("It is a valid triangle.");
            }else{
                System.out.println("It is not a valid triangle.");
            }
        }
    }
}
