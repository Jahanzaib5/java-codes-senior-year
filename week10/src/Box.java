import java.util.ArrayList;

public class Box implements ToBeStored{
    private double maxWeight;
    private double weight;
    private ArrayList<ToBeStored> list = new ArrayList<ToBeStored>();

    public Box(int maxWeight){
        this.maxWeight=maxWeight;
        this.weight=0;
    }

    public void add(ToBeStored element){
        if ((this.weight+element.weight()) < maxWeight){
            this.weight+=element.weight();
            list.add(element);
        }else {
            System.out.println(element + " cannot be added to this box");
        }
    }

    public void add(Book book){
        if ((this.weight+book.weight())<maxWeight){
            this.weight+=book.weight();
            list.add(book);
        }else {
            System.out.println(book+" cannot be added to this box");
        }
    }

    public void add(CD cd){
        if ((this.weight+cd.weight())<maxWeight){
            this.weight+=cd.weight();
            list.add(cd);
        }else {
            System.out.println(cd + " cannot be added to this box");
        }
    }

    public void add (Box box){
        if ((this.weight+box.weight)<maxWeight){
            this.weight+=box.weight;
            list.add(box);
        }else {
            System.out.println(box+" cannot be added to this box");
        }
    }


    public double weight() {
        double weight = 0;

        for (ToBeStored element : list){
            weight=weight+element.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: "+ list.size()+ " things , total weight "+ this.weight + "kg";
    }
}
