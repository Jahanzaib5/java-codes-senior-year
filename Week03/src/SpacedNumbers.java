public class SpacedNumbers {
    public static void main(String[] args){
        int count = 1;
        int count2 = 4;
        while (count<=5){
            int count3 = count2;
            while (count3>=0){
                System.out.print(" ");
                count3--;
            }
            System.out.println(count);
            count++;
            count2--;
        }
    }
}
