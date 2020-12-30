public class ResistorTest {
    public static void main(String[] args) {
        ResistorColorDuo one = new ResistorColorDuo();
        String[] a = {"brown", "black"};
        String[] input = { "green", "brown", "orange" };
        System.out.println(one.value(input));
    }
}
