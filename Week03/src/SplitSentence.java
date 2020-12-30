import java.util.Scanner;

public class SplitSentence {
    public static void main(String args[]) {
        // declaration
        Scanner console = new Scanner(System.in);

        // input
        System.out.print("Enter the single line text please: ");
        String sentence = console.nextLine();

        // processing
        splitSentence2Words(sentence);
    }

    private static void splitSentence2Words(String clause) {
        /* Write a program that reads one line of input text and breaks it up into words. The words should be output
         one per line. A word is defined to be a sequence of letters. Any characters in the input that are not letters
         should be discarded.
         */
        String[] array = clause.split(" ");
        //System.out.println(array.length);
        int count = 0;
        while(count < array.length){
            String b = array[count].replaceAll("[1234567890\'\".,()-/‘/’—]", "");
            //String c = b.replaceAll(" ","").trim();
            System.out.println(b);
            count++;
        }



    }
}