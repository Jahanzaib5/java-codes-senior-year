public class TestMyDate {
    public static void main(String[] args) {
        MyDate d2 = new MyDate(2012, 1, 2);
        System.out.println(d2);                 // Monday 2 Jan 2012
        System.out.println(d2.previousDay());   // Sunday 1 Jan 2012
        System.out.println(d2.previousDay());   // Saturday 31 Dec 2011
        System.out.println(d2.previousMonth()); // Wednesday 30 Nov 2011
        System.out.println(d2.previousYear());  // Tuesday 30 Nov 2010
        System.out.println(d2);
    }
}
