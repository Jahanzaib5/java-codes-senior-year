import java.util.Scanner;

public class OddsComeFirst {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] arr = new int[N];

        for (int i=0; i<N; i++){
            arr[i] = input.nextInt();
        }

        for (int each : oddFirst(arr)){
            System.out.print(each+" ");
        }
    }

    public static int[] oddFirst(int[] arr){
        int[] result = new int[arr.length];
        int[] temp = new int[arr.length];
        int count = 0;
        int count2 = 0;
        for (int j : arr) {
            if (j % 2 != 0) {
                result[count] = j;
                count++;
            } else {
                temp[count2] = j;
                count2++;
            }
        }
        int count3 = 0;
        for (int i=count; i<result.length; i++){
            result[i]=temp[count3];
            count3++;
        }

        return result;
    }
}
