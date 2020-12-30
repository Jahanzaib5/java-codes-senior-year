import java.text.DecimalFormat;

public class Account {
    private final int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void credit(double amount){
        this.balance+=amount;
    }

    public void debit(double amount){
        if (amount > this.balance){
            System.out.println("amount withdrawn exceeds the current balance!");
        }else {
            this.balance-=amount;
        }
    }

    public void print(){
        System.out.printf("A/C no: %d Balance=$%.2f%n", this.accountNumber, this.balance);
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("##.00");
        return "A/C no: " + accountNumber +
                " Balance=$" + format.format(balance);
    }
}
