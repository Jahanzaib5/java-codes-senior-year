import java.util.Scanner;

public class RockPaperScissor10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Player1: ");
        String p1 = input.nextLine();
        System.out.print("Player2: ");
        String p2 = input.nextLine();

        if(p1.equals("sc")  && p2.equals("pp")){
            System.out.println("Winner is Player1");
        }else if(p1.equals("sc") && p2.equals("rc")){
            System.out.println("Winner is Player2");
        }else if(p1.equals("pp") && p2.equals("rc")){
            System.out.println("Winner is Player1");
        }else if(p1.equals("pp") && p2.equals("sc")){
            System.out.println("Winner is Player2");
        }else if(p1.equals("rc") && p2.equals("sc")){
            System.out.println("Winner si Player1");
        }else if(p1.equals("rc") && p2.equals("pp")){
            System.out.println("Winner is Player2");
        }else if(p1.equals(p2)){
            System.out.println("Draw");
        }else {
            System.out.println("Incorrect input");
        }
    }
}
