import java.util.Scanner;

public class HelloOrBye04 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String letter = input.nextLine();
        String check = "Hhello Wworld!";
        if (check.contains(letter)){
            System.out.println("Hello");
        }else{
            System.out.println("Bye");
        }

    }
}
