import java.util.Scanner;

public class Min08 {
    public static void main(String[] args){
        System.out.println();
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if(a==b & a==c ){
            System.out.println("They are all equal");
        }else{
            //int d = Math.min(a,b);
            //int min = Math.min(c,d);
            int d;
            int min;
            if(a==b){
                d = a;
            }else if(a>b){
                d=b;
            }else{
                d=a;
            }

            if(d==c){
                min = d;
            }else if(d>c){
                min = c;
            }else{
                min = d;
            }
            System.out.printf("The least of these three numbers is %d%n", min);
        }
    }
}
