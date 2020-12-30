public class Square extends Rectangle{

    public Square(){};

    public Square(double side){
        super.length=side;
        super.width=side;
    }

    public Square(double side, String color, boolean filled){
        super.color=color;
        super.filled=filled;
        super.length=side;
        super.width=side;
    }

    public double getSide(){
        return getLength();
    }

    public void setSide(double side){
        super.setLength(side);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + super.getLength() +
                "width=" + super.getWidth() +
                ",length=" + super.getLength() +
                ",color='" + super.getColor() + '\'' +
                ",filled=" + super.isFilled() +
                '}';
    }
}
