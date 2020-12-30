import java.util.Arrays;
public class Book {
    private String name;
    private Author[] author;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] author, double price){
        this.name=name;
        this.author=author;
        this.price=price;
    }

    public Book(String name, Author[] author, double price, int qty){
        this.name=name;
        this.author=author;
        this.price=price;
        this.qty=qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return this.author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book[" +
                "name='" + name + '\'' +
                ",Author={" + author.toString() +
                "},price=" + price +
                ",qty=" + qty +
                '}';
    }

    public String getAuthorsName(){
        String result = "";
        for (int i=0; i<author.length; i++){
            result+=author[i].getName();
            result+=", ";
        }
        return result;
    }
}
