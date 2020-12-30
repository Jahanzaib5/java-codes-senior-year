public class WaveNumbers40 {
    public static void main(String[] args){
        int count = 1;
        while (count<=40){
            System.out.print("-");
            count++;
        }
        System.out.println();

        int count2 = 1;
        while (count2<=10){
            System.out.print("_-^-");
            count2++;
        }
        System.out.println();

        int count3 = 1;
        int finalCount = 0;
        while (count3<=9){
            int count4 = 1;
            while (count4<=2){
                System.out.print(count3);
                count4++;
            }
            if(finalCount==2){
                break;
            }

            if(count3==9) {
                count3 = 0;
            }else{
                count3++;
            }
            if(count3==0) {
                finalCount += 1;
            }
        }

        System.out.println();

        int count7 = 1;
        while (count7<=40){
            System.out.print("-");
            count7++;
        }
        System.out.println();


    }
}
