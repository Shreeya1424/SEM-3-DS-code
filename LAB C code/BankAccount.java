public class BankAccount {
    private int accountNumber;
    private double balance;
    private String accountHolder;
    private String name;

    public BankAccount(int accountNumber, double initialBalance, String accountHolder, String name) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.accountHolder = accountHolder;
        this.name = name;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        // Example usage:
        BankAccount account1 = new BankAccount(12345, 1000.0, "John Doe", "Savings");
        account1.deposit(200.0);
        account1.withdraw(50.0);
        System.out.println("Account balance: $" + account1.getBalance());
    }
}
