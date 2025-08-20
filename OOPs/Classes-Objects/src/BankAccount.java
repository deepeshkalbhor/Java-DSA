
public class BankAccount {

    double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        amount = this.balance + amount;
        this.balance = amount;
        System.out.println("Current balance :" + amount);
    }

    public void withdraw(double amount) {
        amount = this.balance - amount;
        System.out.println("Current balance :" + amount);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(10000);

        account.deposit(20000);
        account.withdraw(10000);
    }

}
