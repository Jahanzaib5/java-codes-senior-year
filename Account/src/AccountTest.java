import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        Account myAccount1 = new Account("john Abraham", 78.9);
        Account myAccount2 = new Account("Jhony depp", 69.2);

        System.out.printf("Account: %s ---- Credit: %.2f%n", myAccount1.getName(), myAccount1.getBalance());
        System.out.printf("Account: %s ---- Credit: %.2f%n", myAccount2.getName(), myAccount2.getBalance());

        System.out.printf("Enter amount to %s Account: ", myAccount1.getName());

        double amount1 = input.nextDouble();

        System.out.printf("Adding %.2f to %s account%n", amount1, myAccount1.getName());
        myAccount1.deposit(amount1);

        System.out.printf("Updated balance of %s account is: %.2f%n", myAccount1.getName(), myAccount1.getBalance());

        System.out.println();

        System.out.printf("Enter deposit amount to %s account: ", myAccount2.getName());

        double amount2 = input.nextDouble();

        System.out.printf("Amount %.2f has been deposited to %s account%n", amount2, myAccount2.getName());

        myAccount2.deposit(amount2);

        System.out.printf("Updated amount of %s account is: %.2f",myAccount2.getName(), myAccount2.getBalance());



    }
}
