class Triangle {
    private double side1;
    private double side2;
    private double side3;


    Triangle(double side1, double side2, double side3) throws TriangleException {

        this.side1=side1;
        this.side2=side2;
        this.side3=side3;

    }

    boolean isEquilateral() {
        return this.side1==this.side2 && this.side2==this.side3;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");

    }

    boolean isIsosceles() {
        return side1==side2 || side1==side3 || side3==side2;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    boolean isScalene() {
        return side1 != side2 && side1 !=side3 && side2 != side3;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}