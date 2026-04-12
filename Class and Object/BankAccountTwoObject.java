class BankAccount {

    String accountNumber;
    String accountHolder;
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    double getBalance() {
        return balance;
    }
}

public class BankAccountTwoObjects {
    public static void main(String[] args) {

        // First object
        BankAccount acc1 = new BankAccount();
        acc1.accountNumber = "101";
        acc1.accountHolder = "Navi";
        acc1.deposit(1000);

        // Second object
        BankAccount acc2 = new BankAccount();
        acc2.accountNumber = "102";
        acc2.accountHolder = "Rahul";
        acc2.deposit(2000);

        // Display data
        System.out.println("Account 1: " + acc1.accountHolder +
                ", Balance: " + acc1.getBalance());

        System.out.println("Account 2: " + acc2.accountHolder +
                ", Balance: " + acc2.getBalance());
    }
}
