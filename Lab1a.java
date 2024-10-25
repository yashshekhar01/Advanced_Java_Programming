public class Bank {
    
    // Declare an instance variable named 'amount' of type double
    private double amount;
    
    // Parameterized constructor to initialize 'amount' with 10000
    public Bank(double initialAmount) {
        this.amount = initialAmount; // Initialize the balance with the passed value
    }
    
    // Method to withdraw money based on the given condition
    public void withdraw(double withdrawalAmount) {
        // Use ternary operator to check if there are sufficient funds to withdraw
        String message = (amount >= withdrawalAmount) ? 
                         "Withdraw successful" : "Insufficient funds";
                         
        // If sufficient, update the balance
        amount = (amount >= withdrawalAmount) ? (amount - withdrawalAmount) : amount;
        
        // Print message to console
        System.out.println(message);
    }
    
    // Method to deposit money into the account
    public void deposit(double depositAmount) {
        amount += depositAmount; // Add deposit amount to the total balance
        System.out.println("Deposit successful"); // Print message
    }
    
    // Method to display the current balance
    public void displayBalance() {
        // Print the total balance
        System.out.println("Total balance: " + amount);
    }

    // Main method to test the Bank class
    public static void main(String[] args) {
        // Create an instance of Bank and initialize 'amount' to 10000
        Bank myAccount = new Bank(10000);
        
        // Try to withdraw 2000 from the account
        myAccount.withdraw(2000); 
        
        // Deposit 5000 into the account
        myAccount.deposit(5000);
        
        // Display the final balance
        myAccount.displayBalance();
    }
}
