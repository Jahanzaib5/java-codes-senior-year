public class HammingTest {
    public static void main(String[] args) {
        Hamming one = new Hamming("AUG", "AUB");
        System.out.println(one.getHammingDistance());
    }
}
