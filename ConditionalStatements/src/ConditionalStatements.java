import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int numb = input.nextInt();

        if (numb >= 90){
            System.out.println("You got \"A\" grade!");
        }else{
            System.out.println("Your grade is not \"A\"! ");
            System.out.println(numb >= 70 ? "Barely good" : "You goof");
        }
    }
}
