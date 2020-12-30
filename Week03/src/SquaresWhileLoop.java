public class SquaresWhileLoop {
    public static void main(String[] args){
        int count = 1;
        int sum = 0;
        while(count<=20){
            if(count % 2 != 0){
                sum+=count;
                System.out.print(sum+" ");
                //System.out.println(count);
            }
            count++;
        }
        System.out.println();
        int count2 = 1;
        while(count2<=10){
            System.out.print((count2*count2)+" ");
            count2++;
        }
    }
}
