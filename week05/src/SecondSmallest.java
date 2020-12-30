import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallest {
    public static void main(String[] args)
    {
        //enter your code here...
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N: ");
        int num = input.nextInt();
        double[] arr = new double[num];
        for (int i=0; i<num; i++){
            arr[i]=input.nextDouble();
        }

        System.out.println(secondSmallest(arr));

    }

    public static double secondSmallest(double[] arr){
        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        return arr[1];
    }

}