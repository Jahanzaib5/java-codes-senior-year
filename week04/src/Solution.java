import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // add your code here
        // code must use abbreviate() method as part of solution
        Scanner input = new Scanner(System.in);
        int no = input.nextInt();
        String[] array = new String[no+1];
        for (int i=0; i<array.length;i++){
            System.out.print("Enter word no"+ i);
            array[i]=input.nextLine();
        }

        for (int i=1; i<array.length;i++){
            System.out.println(abbreviate(array[i]));
        }

    }

    private static String abbreviate(String word) {
        // add your code here
        String result = "";
        if (word.length()<10){
            return word;
        }else {
            result+=word.charAt(0);
            String check = word.substring(1,word.length()-1);
            result+=check.length();
            result+=word.charAt(word.length()-1);
        }
        return result;
    }
}