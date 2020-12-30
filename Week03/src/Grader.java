import java.util.Scanner;

public class Grader {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int grade = input.nextInt();
        if (grade >= 50 & grade <= 100){
            System.out.println("Passed");
        }else if(grade < 50 & grade >= 0){
            System.out.println("Failed");
        }else{
            System.out.println("Incorrect grade!");
        }


    }
}
