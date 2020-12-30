import java.util.Scanner;

public class SplitDigits {
    public static void main(String[] args){
        splitDigits();
    }

    public static void splitDigits(){
        Scanner input = new Scanner(System.in);
        String check = input.nextLine();
        String number = check.trim();
        int counter = 0;
        if(number.length()==5) {
            while (counter < 5) {
                System.out.println(number.charAt(counter));
                counter++;
            }
        }else if(number.length() >5){
            System.out.println("Number is too long!");
        }else{
            System.out.println("Number is too short!");
        }
    }
}
