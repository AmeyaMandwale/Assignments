public class BankAccount {

        private double balance;

        // Constructor to initialize the balance
        public BankAccount() {
            balance = 0.0; // Start with a balance of zero
        }

        // Method to get the current balance
        public double getBalance() {
            return balance;
        }

        // Method to deposit money into the account
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount; // Increase balance by deposit amount
                System.out.println("You have deposited $" + amount);
            } else {
                System.out.println("Please enter a positive amount to deposit.");
            }
        }

        // Method to withdraw money from the account
        public void withdraw(double amount) {
            if (amount > 0) {
                if (balance >= amount) {
                    balance -= amount; // Decrease balance by withdrawal amount
                    System.out.println("You have withdrawn $" + amount);
                } else {
                    System.out.println("Insufficient funds. You cannot withdraw more than your current balance.");
                }
            } else {
                System.out.println("Please enter a positive amount to withdraw.");
            }
        }
    }
