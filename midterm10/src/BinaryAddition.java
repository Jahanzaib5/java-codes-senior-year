import java.util.Scanner;

public class BinaryAddition {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input first binary number: ");
        long bin1 = input.nextLong();
        System.out.print("Input second binary number: ");
        long bin2 = input.nextLong();

        System.out.println("Sum of two binary numbers: "+ binaryAddition(bin1, bin2));


    }

    public static int binaryAddition(long bin1, long bin2){
        String result = "";
        long car = 0;

        while ( bin1 != 0 || bin2 != 0){
            long check = (bin1%10 + bin2%10 + car) % 2;
            result+=(check);
            car = (bin1%10 + bin2%10 + car) / 2;
            bin1=bin1/10;
            bin2=bin2/10;
        }

        if (car != 0){
            result+=(car);
        }

        String result2 = "";

        for (int i= result.length()-1; i>=0; i--){
            result2+=result.charAt(i);
        }

        //System.out.println(result2);
        //System.out.println("Sum of two binary numbers: "+ Integer.parseInt(result2));
        return Integer.parseInt(result2);

    }
}
