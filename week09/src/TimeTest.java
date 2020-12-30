public class TimeTest {
    public static void main(String[] args) {
        Time one = new Time(1, 2, 0);
        System.out.println(one.toString());
        System.out.println(one.nextSecond());
        System.out.println(one.previousSecond());
    }
}
