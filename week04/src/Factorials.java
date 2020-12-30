import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        // add your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = input.nextInt();
        if (number <0){
            System.out.println("Incorrect input!");
        }else {
            System.out.print("X    X!\n");
            for (int j=0; j<=number; j++){
                System.out.println(j+"    "+factorialOfN(j));
            }
        }

    }

    private static long factorialOfN(int n) {
        // add your code here
        long product = 1;
        if (n==0){
            return product;
        }else {
            for (int i=1; i<=n; i++){
                product*=i;
            }
        }
        return product;
    }
}
