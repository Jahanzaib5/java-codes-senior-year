public class AccountTest {
    public static void main(String[] args){
        Account mine = new Account(991234, 88.88123);
        System.out.println(mine.toString());
        System.out.println(mine.getAccountNumber());
        System.out.println(mine.getBalance());
        mine.setBalance(88.8812345);
        mine.credit(10);
        mine.print();
        mine.debit(100);
        mine.print();
    }
}
