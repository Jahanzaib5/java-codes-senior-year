import java.util.Scanner;

public class CapitalizeFirstLetter {

    public static void main(String args[]) {
        // add your code here
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        System.out.println(capitalize(sentence));
    }

    public static String capitalize(String sentence){
        // add your code here
        String result = "";
        String[] array = sentence.trim().split(" ");

        for (int i = 0; i < array.length; i++){
            if (array[i].length() == 1){
                result+=((Character.toUpperCase(array[i].charAt(0)))+" ");
            }else {
                result+=((Character.toUpperCase(array[i].charAt(0)))+(array[i].substring(1))+" ");
            }
        }

        return result.trim();
        //for (int i=1; i<sentence.length(); i++){
        //    result+=(sentence.substring(0,i).toUpperCase()+ sentence.substring(1));
        //    result+=" ";
        //}
        //return sentence.substring(0, 1).toUpperCase();// + sentence.substring(1);
        //return result;
    }
}