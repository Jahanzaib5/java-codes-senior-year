import java.util.Scanner;

public class TImeOfTheDay05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int time = input.nextInt();

        if(time >=0 && time <=24){
            if(time >=0 && time <=5){
                System.out.println("Good night!");
            }else if(time <=10 && time > 5){
                System.out.println("Good morning!");
            }else if(time <=20 && time > 10 ){
                System.out.println("Good day!");
            }else{
                System.out.println("Good evening!");
            }
        }else{
            System.out.println("Not acceptable time.");
        }
    }
}
