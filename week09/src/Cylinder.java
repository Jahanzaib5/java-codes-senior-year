public class Cylinder extends Circle{
    private double height = 1.0;

    public Cylinder(){};

    public Cylinder(double radius){
        super(radius);
    }


    public Cylinder(double radius, double height){
        super(radius);
        this.height=height;
    }

    public Cylinder(double radius, double height, String color){
        super(radius, color);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return super.getArea() * getHeight();
    }

    @Override
    public double getArea(){
        return 2 * Math.PI * getRadius() * getHeight() + 2 * super.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder[" +
                "height=" + getHeight()+
                ",radius=" + getRadius() +
                ",color='" + getColor() + '\'' +
                ']';
    }
}
