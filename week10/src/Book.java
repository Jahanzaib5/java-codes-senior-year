public class Book implements ToBeStored {
    private String writer;
    private String name;
    private double weight;

    public Book(String writer, String name, double weight){
        this.weight=weight;
        this.writer=writer;
        this.name=name;
    }

    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return  writer + ": " + name;
    }
}
