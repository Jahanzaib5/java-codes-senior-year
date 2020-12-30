import java.util.Scanner;
import java.util.Arrays;


public class AdjacentArrayElements {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String a = input.nextLine().trim();
        String[] enter;
        try {
            enter = a.split(" ", -1);
            int[] arr = new int[enter.length];
            for (int i=0; i<enter.length; i++){
                arr[i]=Integer.parseInt(enter[i]);
            }
            //System.out.println(Arrays.toString(arr));
            if (enter.length != 10){
                System.out.println("Error");
            } else if (checkException(enter)){
                System.out.println(checkAdjacent(arr));
            }
        }catch (Exception e){
            System.out.println("Error");
        }

    }


    public static int checkAdjacent(int[] arr){
        int count = 0;
        int check = -12;
        int result = 0;
        for (int i=1; i<arr.length; i++){
            if (arr[count]==arr[i]){
                if (check != arr[i]){
                    result++;
                    check = arr[i];
                }
            }else {
                check = -12;
            }
            count++;
            //check=arr[i];
        }
        return result;

    }

    public static boolean checkException(String[] enter){
        boolean val = true;
        try {

            for (int i=0; i<enter.length; i++){
                int b =Integer.parseInt(enter[i]);
            }
        }catch (Exception e){
            System.out.println("Error");
            val = false;
        }
        return val;
    }
}
