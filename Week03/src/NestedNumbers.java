public class NestedNumbers {
    public static void main(String[] args){
        int count3 = 0;
        while (count3<3){
            int count = 0;
            while(count<=9){
                int count2 = 0;
                while (count2 < 3){
                    System.out.print(count);
                    count2++;
                }
                count++;
            }
            System.out.println();
            count3++;
        }

    }
}
