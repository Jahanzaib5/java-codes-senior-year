import java.util.Scanner;

public class OddEven03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println();
        int numb = input.nextInt();

        if( numb == 0) {
            System.out.println("0 is not odd nor even");
        }else if(numb % 2 == 0) {
            System.out.println("This number is even");
        }else{
            System.out.println("This number is odd");
        }
    }
}
