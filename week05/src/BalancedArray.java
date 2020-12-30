import java.util.Scanner;
import java.util.Arrays;


public class BalancedArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String enter = input.nextLine().trim();
        String[] array = enter.split(" ", -1);

        if (checkInput(array)){
            int[] arr = new int[10];
            for (int i=0; i<10; i++){
                arr[i]=Integer.parseInt(array[i]);
            }
            int sum1 = arr[0];
            for (int j=1; j<arr.length; j++){
                int sum2 = checkSum(Arrays.copyOfRange(arr, j, arr.length));

                if (sum1 == sum2){
                    System.out.println("Can be balanced");
                    break;
                }else if (sum1 > sum2){
                    System.out.println("Can not be balanced");
                    break;
                }
                sum1+=arr[j];
            }

        }

        //System.out.println("arr: "+Arrays.toString(arr));

    }

    public static int checkSum(int[] array){
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

    public static boolean checkInput(String[] arr){
        boolean val = true;
        try {
            for (int i=0; i<10; i++){
                int a=Integer.parseInt(arr[i]);
            }
        }catch (NumberFormatException e){
            System.out.println("Error");
            val = false;
        }
        return val;
    }
}
