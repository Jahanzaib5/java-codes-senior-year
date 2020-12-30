import java.util.Scanner;
import java.util.Arrays;


public class MaximumSpan {
    public static void main(String[] args) {
        // add your code here
        Scanner console = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        String a = input.nextLine().trim();
        String[] enter = a.split(" ", -1);
        int[] arr = new int[enter.length];
        for (int i=0; i<enter.length; i++){
            arr[i]=Integer.parseInt(enter[i]);
        }
        //System.out.println(Arrays.toString(arr));
        System.out.println(maxSpan(arr));
    }

    private static int maxSpan(int[] numbers) {
        // add your code here
        int count = 0;
        int max = 0;
        if (numbers.length == 1) {
            count=1;
        }else {
            for (int i=0; i<numbers.length; i++){
                for (int j=numbers.length-1; j>i; j--){
                    if (numbers[i]==numbers[j]){
                        count=(Arrays.copyOfRange(numbers, i, j+1)).length;
                        //System.out.println("COunt: "+count);
                        //System.out.println("temp: "+Arrays.toString((Arrays.copyOfRange(numbers, i, j+1))));
                        max = Math.max(count, max);
                    }
                }
            }

        }
        max=Math.max(count,max);
        return max;
    }
}