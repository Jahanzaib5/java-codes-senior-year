import java.util.Scanner;
import java.util.Arrays;

public class MaxMirror {
    public static void main(String[] args)
    {
        //your statements to test method here
        Scanner input = new Scanner(System.in);
        String a = input.nextLine().trim();
        String[] array = a.split(" ", -1);
        int[] arr = new int[array.length];
        for (int i=0;i<array.length;i++){
            int check = Integer.parseInt(array[i]);
            arr[i] = check;
        }
        System.out.println(maxMirror(arr));
    }

    //your method here...


    public static int maxMirror(int[] arr){
        int max = 0;
        for (int i=0; i<arr.length; i++){
            for (int j=arr.length-1; j>=0; j--){
                int result=0;
                int count=i;
                int count2=j;

                while (count < arr.length && count2 >=0 && arr[count]==arr[count2] &&  count!=count2){
                    result++;
                    count++;
                    count2--;
                    if (count==count2){
                        break;
                    }
                }
                max = Math.max(result, max);
            }
        }
        if (max == arr.length){
            max = max/2;
        }
        return max;
    }

}