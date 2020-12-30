//import java.util.InputMismatchException;
import java.util.Scanner;
//import java.util.Arrays;


public class ZeroFront {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String a = input.nextLine().trim();
        String[] array = a.split(" ", -1);
        int[] arr = new int[array.length];
        int[] temp = new int[array.length];


        try {
            int count = 0;
            int count2 = 0;
            for (int i=0; i<array.length; i++){
                int check = Integer.parseInt(array[i]);
                if (check == 0){
                    arr[i]=check;
                    count2++;
                }else {
                    temp[count]=check;
                    count++;
                }
                //System.out.print(array[i]+" ");
            }
            int fin = arr.length - count2;

            for (int k = 0; k<fin; k++){
                arr[count2] = temp[k];
                count2++;
            }
            //System.out.println(Arrays.toString(arr));

            for (int h=0; h<arr.length; h++){
                System.out.print(arr[h]+" ");
            }

        }catch (NumberFormatException e){
            System.out.println("Input error");
        }
        //System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString(temp));


    }
}
