package Shape;

public class Square extends Rectangle{

    public Square(){};

    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public double getSide(){
        return getLength();
    }

    public void setSide(double side){
        super.setLength(side);
    }

    @Override
    public void setWidth(double side){
        super.setWidth(side);
    }

    @Override
    public void setLength(double side){
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "A Square with side=" + getWidth()+
                ", "+" which is a subclass of "+
                super.toString();
    }

    @Override
    public double getArea(){
        return getSide() * getSide();
    }

    @Override
    public double getPerimeter(){
        return 2 * (getSide() + getSide());
    }
}
