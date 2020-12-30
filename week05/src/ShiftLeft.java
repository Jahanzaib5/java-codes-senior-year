import java.util.Arrays;
import java.util.Scanner;

public class ShiftLeft {
    public static void main(String[] args){
        System.out.println("Enter your numbers, press return to end.");
        Scanner input = new Scanner(System.in);
        StringBuilder storeInt = new StringBuilder(); //to store the input values as a string in string builder
        int N = 0; //the right shift number

        boolean inputCounter = false; //to check the user has input valid input

        while (input.hasNextLine()) {
            String enter = input.nextLine();  // get input from the user
            if (enter.isEmpty()) { // will get input until an empty line in inserted by pressing enter
                //System.out.println();
                System.out.println("Enter N:");
                N = input.nextInt(); //asked for right shift number
                break;
            }
            if (check(enter)){ //calls the method to check for incorrect input(other than integer)
                //arrL.add(Integer.parseInt(enter));
                storeInt.append(enter+" "); //if integer are input, then append the value to string builder
                inputCounter=true;
            }
        }

        if (inputCounter){
            String[] tempArray = storeInt.toString().trim().split(" ", -1); //array of string input
            int[] array = new int[tempArray.length];
            for (int i=0; i<tempArray.length; i++){ // to change the string input to array of integers
                int temp = Integer.parseInt(tempArray[i]);
                array[i]=temp;
            }

            if (N > array.length){ //if shifter is grater, then choose the modulo
                N = N % array.length;
            }

            int[] printOut = shiftRight(array, N); //calling the method to right shift the array
            System.out.print(printOut[0]); //printing out the right shifted array's element
            for (int l=1; l<array.length; l++){
                System.out.print(", "+printOut[l]);
            }
        }

    }

    public static boolean check(String a){ //to check for incorrect input
        boolean val = false;
        try {
            int b = Integer.parseInt(a);
            val = true;

        }catch (NumberFormatException e){
            System.out.println("Not a legal number. Try again!");
        }
        return val;
    }


    public static int[] shiftRight(int[] array, int N){
        int count = N;
        int count2 = 0;
        int[] checkArray = new int[array.length];
        int[] tempArray = new int[N];
        for (int i=0; i<N; i++){ //array to temporarily store the elements shifted after the shift no
            tempArray[i]=array[i];
            //count--;
        }
        //System.out.println("tempArray: "+Arrays.toString(tempArray));
        for (int j=N; j<array.length; j++){ //first array to store the shifted elements before shift number
            checkArray[count2] = array[j];
            count2++;
        }
        //System.out.println("checkArray: "+Arrays.toString(checkArray));
        //System.out.println("count2: "+count2);
        for (int k=0; k<tempArray.length; k++){//adding the element of first temp array to final array
            checkArray[count2]=tempArray[k];
            count2++;
        }

        return checkArray;
    }



}
