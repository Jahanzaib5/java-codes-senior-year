import java.util.Scanner;

public class ShowTwos {
    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if (num >=2){
            System.out.print(showTwos(num));
        }else {
            System.out.println("Enter valid number");
        }
    }

    public static String showTwos(int number){
        // write your code here
        String result = Integer.toString(number);
        result+=" = ";
        int count = 0;
        while (number % 2 == 0){
            number = number / 2;
            count+=1;
        }

        if (count > 0){
            for (int i=0; i<count;i++){
                result+="2 * ";
            }
        }

        result+=Integer.toString(number);

        return result;
    }
}