public class CircleTest {
    public static void main(String[] args){
        Circle small = new Circle();
        System.out.printf("%s----%f", small.getColor(), small.getRadius());

        Circle uSmall = new Circle(8);
        System.out.printf("%s---%f", uSmall.getColor(), uSmall.getRadius());
    }
}
