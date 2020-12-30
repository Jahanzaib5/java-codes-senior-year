import java.util.Scanner;
import java.util.Arrays;

public class MagicSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int c = input.nextInt();
        //System.out.println(r+"---"+c);
        if (r == c) {
            int[][] arr = new int[r][c];
            for (int i=0; i<r; i++){
                for (int j=0; j<c; j++){
                    arr[i][j]=input.nextInt();
                }
            }
            if (isMagicSquare(arr)){
                System.out.println("true");
            }else {
                System.out.println("false");
            }
        }else {
            System.out.println("false");
        }
    }

    public static boolean isMagicSquare(int[][] arr){
        int[] rowM = checkRowSum(arr);
        int[] colM = chekColumnSum(arr);
        int[] diag = checkDiagonal(arr);
        boolean result = true;

        if (diag[1]==diag[0]){
            int fin = diag[0];
            for (int i=0; i<rowM.length; i++){
                if (rowM[i] != colM[i] || rowM[i] != fin){
                    result=false;
                    break;
                }
            }
        }else {
            result=false;
        }



        return result;

    }

    public static int[] checkRowSum(int[][] arr){
        boolean result2 = true;
        int[] check = new int[arr.length];
        for (int i=0; i<arr.length; i++){
            int sum = 0;
            for (int j=0; j<arr[0].length; j++){
                sum+=arr[i][j];
            }
            check[i]=sum;
        }
        //System.out.println("row sum: "+Arrays.toString(check));
        return check;

//        int fin = check[0];
//        for (int each : check){
//            if (each != fin){
//                result2=false;
//                break;
//            }
//        }
//        if (result2){
//            return fin;
//        }

    }

    public static int[] chekColumnSum(int[][] arr){
        boolean angi = true;
        int[] check = new int[arr.length];
        for (int i=0; i<arr.length; i++){
            int sum = 0;
            for (int j=0; j<arr[0].length; j++){
                sum+=arr[j][i];
            }
            check[i]=sum;
        }
        //System.out.println("colmn sum: "+Arrays.toString(check));
        return check;

//        int fin = check[0];
//        for (int each : check){
//            if (each != fin) {
//                angi = false;
//                break;
//            }
//        }
//
//        if (angi){
//            return fin;
//        }
    }

    public static int[] checkDiagonal(int[][] arr){
        int[] result = new int[2];
        int sum1 = 0;
        for (int i=0; i<arr.length; i++) {
            sum1 += arr[i][i];
        }
        result[0]=sum1;

        int sum2 = 0;
        for (int i=arr.length-1; i>=0; i--){
            sum2+=arr[i][i];
        }
        result[1]=sum2;
        //System.out.println("diag sum: "+Arrays.toString(result));
        return result;

    }



}
