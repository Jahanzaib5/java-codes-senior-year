public class NumbersTriangle {
    public static void main(String[] args){
        int count = 1;
        while(count<=7){
            int count2 = 0;
            while (count2<count){
                System.out.print(count);
                count2++;
            }
            System.out.println();
            count++;
        }
    }
}
