public class TestCylinder {
    public static void main(String[] args) {
        Circle one = new Circle(5);
        Cylinder two = new Cylinder(5,8);
        //one = two;
        System.out.println(one.getArea());
        System.out.println(two.getArea());
        System.out.println(two.getVolume());
        System.out.println(one);
        System.out.println(two);

    }
}

