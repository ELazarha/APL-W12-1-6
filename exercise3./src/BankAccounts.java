//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class BankAccounts {
    private String accountNumber;
    private double balance;
    private String accountHolderName;

    public BankAccounts(String var1, String var2, double var3) {
        this.accountNumber = var1;
        this.accountHolderName = var2;
        this.balance = var3;
    }

    public void deposit(double var1) {
        if (var1 > 0.0) {
            this.balance += var1;
            System.out.println("Deposited: " + var1);
        } else {
            System.out.println("Invalid deposit amount.");
        }

    }

    public boolean withdraw(double var1) {
        if (var1 > 0.0 && var1 <= this.balance) {
            this.balance -= var1;
            System.out.println("Withdrew: " + var1);
            return true;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
            return false;
        }
    }

    public boolean transfer(BankAccounts var1, double var2) {
        if (this.withdraw(var2)) {
            var1.deposit(var2);
            System.out.println("Transferred: " + var2 + " to " + var1.getAccountHolderName());
            return true;
        } else {
            return false;
        }
    }

    public void generateReport() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Holder: " + this.accountHolderName);
        System.out.println("Balance: " + this.balance);
    }

    public String getAccountHolderName() {
        return this.accountHolderName;
    }
}
