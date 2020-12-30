import java.util.Scanner;
public class Age06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if(age <= 150 && age >=18){
            System.out.println("Old enough!");
        }else if(age < 18 && age > 0){
            System.out.println("Too young.");
        }else{
            System.out.println("Incorrect age.");
        }
    }
}
