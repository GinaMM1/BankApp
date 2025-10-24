
import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

public class BankApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.UK);
        System.out.println("Welcome to Budget banking, to start please enter your full name.");
        String name = scanner.nextLine().trim(); // captures the full name input 

        BudgetManager manager = new BudgetManager(100.00);

        System.out.println("Account Holder: " + name + "Balance: " + currency.format(manager.getBalance()));
        System.out.println();

        // Displays Banking Menu here 
        System.out.print("" + System.lineSeparator() + "");
        System.out.print("" + System.lineSeparator() + "");
        System.out.println("------Banking Menu-----");
        System.out.print("" + System.lineSeparator() + "");
        System.out.println("1. Deposit");
        System.out.print("" + System.lineSeparator() + "");
        System.out.println("2. Check Balance");
        System.out.print("" + System.lineSeparator() + "");
        System.out.println("3. Withdraw");
        System.out.print("" + System.lineSeparator() + "");
        System.out.println("4.Exit");
        System.out.print("" + System.lineSeparator() + "");

        while (true) {
            System.out.println("\nPlease select an option between 1-4");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Deposit Amount selected.");
                System.out.print("Enter deposit amount:");
                double deposit = scanner.nextDouble();
                manager.deposit(deposit);
                System.out.println("Deposit successful:" + currency.format(deposit));
                System.out.println("Balance Updated:" + currency.format(manager.getBalance()));

            } else if (choice == 2) {
                System.out.println("Check Balance selected:" + currency.format(manager.getBalance()));

            } else if (choice == 3) {
                System.out.println("Withdraw selected:");
                System.out.print("Enter withdrawal amount: ");
                double withdrawal = scanner.nextDouble();
                if (manager.withdraw(withdrawal)) {
                    System.out.println("Amount has been successfully withdrawn : " + currency.format(withdrawal));

                } else {
                    System.out.println("Insufficient funds, withdrawal has been cancelled.");
                }
            } else if (choice == 4) {
                System.out.println("Exciting application");
                break;
            } else {
                System.out.println("Invalid option has been selected, PLease choose between 1-4");
            }
        }
        scanner.close();
    }
}
