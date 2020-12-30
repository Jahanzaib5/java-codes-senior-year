public class ForLoop {
    public static void main(String[] args){
        for(int x = 4;x < 5; x++){
            for (int j=1; j<=10; j++){
                System.out.printf("%d * %d = %d%n", x,j,x*j);
            }
            //System.out.println(x);
        }
    }
}
