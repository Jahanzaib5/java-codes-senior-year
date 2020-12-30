public class MyTimeTest {
    public static void main(String[] args) {
        MyTime now = new MyTime();
        now.setTime(24, 0, 0);
        System.out.println(now);
        //System.out.println(now.nextHour());
        System.out.println(now.previousHour());
        //System.out.println(now.nextMinute());
        System.out.println(now.previousMinute());
        //System.out.println(now.nextSecond());
        System.out.println(now.previousSecond());

    }
}
