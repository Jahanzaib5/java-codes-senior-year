import java.util.Date;

public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(Customer customer, Date date){
        this.customer = customer;
        this.date=date;
    }

    public String getName(){
        return customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {

        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpenses(){
//        double result = 0;
//
//        //to check for membership type
//        double serDiscount = 0;
//        if (this.customer.getMemberType().equals("Premium")){
//            serDiscount = serviceExpense * (0.2);
//        }else if (this.customer.getMemberType().equals("Gold")){
//            serDiscount = serviceExpense *  (0.15);
//        }else if (this.customer.getMemberType().equals("Silver")){
//            serDiscount = serviceExpense * (0.1);
//        }
//        result += (getServiceExpense() - serDiscount);
//
//        //to check for membership
//        double proDiscount = 0;
//        if (this.customer.isMember()){
//            proDiscount = serviceExpense * (0.1);
//        }
//
//        result += (getProductExpense() - proDiscount);
//
//        return result;
        double prRate = DiscountRate.getProductDiscountRate(customer.getMemberType());
        double serRate = DiscountRate.getServiceDiscountRate(customer.getMemberType());
        return ((getProductExpense() - getProductExpense() * prRate)+ (getServiceExpense() - getServiceExpense() * serRate));
    }

    @Override
    public String toString() {
        return "Visit[" +
                "customer=" + customer +
                ",date=" + date +
                ",serviceExpense=" + serviceExpense +
                ",productExpense=" + productExpense +
                ",totalExpense" + getTotalExpenses()+
                ']';
    }
}
