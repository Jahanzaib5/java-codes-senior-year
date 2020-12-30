import java.util.Scanner;

public class WordLengthes {
    public static void main(String[] args)
    {
        //your statements to test method here
        Scanner input = new Scanner(System.in);
        String a = input.nextLine().trim();
        String[] array = a.split(" ", -1);
        for (int i=0; i<array.length; i++){
            //System.out.println(array[i]);
            System.out.print((i+1)+": ");
            System.out.print(checkLength(array[i]));
            //System.out.print("    ");
            int length = String.valueOf(checkLength(array[i])).length();
            if (length == 1){
                System.out.print("    ");
            }else {
                System.out.print("   ");
            }
            for (int j=0; j<checkLength(array[i]); j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

    //your method here...
    public static int checkLength(String check){
        //return check.length();
        int count = 0;
        for (int i=0; i< check.length(); i++){
            char a = check.charAt(i);
            char b = Character.toLowerCase(a);
            if (b >= 'a' && b<= 'z'){
                count++;
            }
        }
        return count;
    }
}