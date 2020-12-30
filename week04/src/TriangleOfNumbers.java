import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        printTriangle(n);
    }

    private static void printTriangle(int n) {
        // add your code here
        //int count = n;
        for (int i=1; i<=n; i++ ){
            for (int j=i; j<n; j++){
                System.out.print(" ");
            }
            //System.out.println(i);
            for (int k=1; k<=i; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}