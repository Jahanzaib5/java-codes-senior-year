import java.util.Scanner;

public class LettersSpacesNumbers {
    public static void main(String[] args) {
        //your statements to test method here
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        int letterCount = 0;
        int spaceCount = 0;
        int numberCount = 0;
        int otherCount = 0;
        for (int i = 0; i<sentence.length(); i++){
            char check = sentence.charAt(i);
            if (letterCheck(check)){
                letterCount++;
            }else if(spaceCheck(check)){
                spaceCount++;
            }else if(numberCheck(check)){
                numberCount++;
            }else {
                otherCount++;
            }
        }
        System.out.println("letter: "+ letterCount);
        System.out.println("space: "+ spaceCount);
        System.out.println("number: "+ numberCount);
        System.out.println("other: "+ otherCount);
    }

    //your method here...
    public static boolean letterCheck(char check){
        char a = Character.toLowerCase(check);
        return a >= 'a' && a<= 'z';
    }

    public static boolean numberCheck(char a){
        return a >= '0' && a <= '9';
    }

    public static boolean spaceCheck(char chek){
        return chek == ' ';
    }
}