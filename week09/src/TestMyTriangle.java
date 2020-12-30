public class TestMyTriangle {
    public static void main(String[] args) {
        MyPoint v1 = new MyPoint(2,0);
        MyPoint v2 = new MyPoint(-2, 0);
        MyPoint v3 = new MyPoint(0,2);
        MyTriangle one = new MyTriangle(v1, v2, v3);
        System.out.println(one.printType());
        System.out.println(one.getPerimeter());
        System.out.println(one);
    }
}
