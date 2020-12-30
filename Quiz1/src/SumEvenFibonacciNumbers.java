import java.util.Scanner;

public class SumEvenFibonacciNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int f0 = 0;
        int f1 = 1;
        int f2;
        //StringBuilder result = new StringBuilder();
        //result.append(f0+"\n");
        //result.append(f1+"\n");

        int result = 0;

        for (int i=2; i<=number*2; i++){
            f2 = f0 + f1;
            f0=f1;
            f1=f2;
            //result.append(f2+"\n");
            if (f2 >number){
                break;
            }else {
                if (f2%2==0 && f2 >=0){
                    result+=f2;
                }
            }
        }

        System.out.println(result);


    }
}
