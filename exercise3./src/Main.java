
public class Main {

    public static void main(String[] var0) {
        BankAccounts var1 = new BankAccounts("123456", "hyly ", 1000.0);
        BankAccounts var2 = new BankAccounts("789012", "leeminhy", 2000.0);
        var1.deposit(500.0);
        var1.withdraw(200.0);
        var1.transfer(var2, 300.0);
        System.out.println("Account 1 Report:");
        var1.generateReport();
        System.out.println("Account 2 Report:");
        var2.generateReport();
    }
}
