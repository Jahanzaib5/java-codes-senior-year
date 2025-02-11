public class Account {
    private int id;
    private Customer customer;
    private double balance = 0.0;

    public Account(int id, Customer customer, double balance){
        this.id=id;
        this.customer=customer;
        this.balance=balance;
    }

    public Account(int id, Customer customer){
        this.id=id;
        this.customer=customer;
    }

    public int getID() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return String.format("%s(%d) balance=$%.2d", getCustomerName(), getID(), getBalance());
    }
    
    public String getCustomerName(){
        return getCustomer().getName();
    }
    
    public Account deposit( double amount){
        return new Account(getID(), getCustomer(), getBalance()+amount);
    }
    
    public Account withdraw(double amount){
        Account acc = null;
        if (balance >= amount){
            acc= new Account(getID(), getCustomer(), this.balance-amount);
        }else if (balance < amount){
            System.out.println("amount withdrawn exceeds the current balance");
            acc = new Account(getID(), getCustomer());
        }
        return acc;
    }
}
