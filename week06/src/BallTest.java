public class BallTest {
    public static void main(String[] args) {
        Ball ball1 = new Ball(1.0f, 1.0f, 1, 5, 2);
        System.out.println(ball1);
        System.out.println(ball1.getRadius());
        ball1.reflectHorizontal();
        ball1.reflectVertical();
        System.out.println(ball1);
    }
}
