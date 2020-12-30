package DifferentBoxes;

public class DriverBox {
    public static void main(String[] args) {
        Thing one = new Thing("Coffee", 5);
        Thing two = new Thing("Milk", 5);
        Thing three = new Thing("Sugar", 5);
        System.out.println(one.equals(two));
        System.out.println(one.equals(one));
        System.out.println(one.hashCode());
        System.out.println(one.hashCode());
        System.out.println(two.hashCode());
        //System.out.println(one.equals(three));

//        MaxWeightBox coffeeBox = new MaxWeightBox(10);
//        coffeeBox.add(one);
//        coffeeBox.add(two);
        //coffeeBox.add(three);

        //System.out.println(coffeeBox.isInTheBox(new Thing("Coffee")));

//        oneThingBox box = new oneThingBox();
//        box.add(one);
        //box.add(two);

        //System.out.println(box.isInTheBox(new Thing("Coffee")));
        //System.out.println(box.isInTheBox(new Thing("Milk")));

        BlackHoleBox bBox = new BlackHoleBox();
        bBox.add(one);
        bBox.add(two);
        bBox.add(three);

//        System.out.println(bBox.isInTheBox(new Thing("Coffee")));
//        System.out.println(bBox.isInTheBox(new Thing("Milk")));

        //System.out.println(one.equals(two));
        //System.out.println(one.equals(one));

        //Thing infinite = new Thing("jam", 0);

    }
}
