public class WhileCounter {
    public static void main(String[] args){
        int counter = 1;

        while (counter <=10){
            System.out.print(counter);
            System.out.println(counter==5?" Hell yeah": " nah");
            counter++;
        }
    }
}
