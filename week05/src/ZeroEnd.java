import java.util.Scanner;


public class ZeroEnd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String a = input.nextLine().trim();
        String[] array = a.split(" ", -1);
        int[] arr = new int[array.length];


        try {
            int count = 0;
            for (int i=0; i<array.length; i++) {
                int check = Integer.parseInt(array[i]);
                if (check != 0) {
                    arr[count] = check;
                    count++;
                }
            }
            for (int j=0; j<arr.length; j++){
                System.out.print(arr[j]+" ");
            }

        }catch (NumberFormatException e){
            System.out.println("Input error");
        }

    }
}
