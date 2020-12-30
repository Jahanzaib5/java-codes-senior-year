public class InvoiceItemTest {
    public static void main(String[] args){
        InvoiceItem one = new InvoiceItem("21", "yup", 12, 2.0);
        System.out.println(one.getTotal());
        System.out.println(one.toString());
    }
}
