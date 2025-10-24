
import java.util.Scanner;

public class BudgetApp {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Budget banking, to start please enter your full name.");
        String name = scanner.nextLine();
        System.out.print("Account Holder: " + name);

        // Menu Options
        String option1 = "Deposit";
        String option2 = "Check Balance";
        String option3 = "Withdraw";
        String option4 = "Exit";

        // Displays Banking Menu here 
        System.out.print("" + System.lineSeparator() + "");
        System.out.print("" + System.lineSeparator() + "");
        System.out.println("------Banking Menu-----");
        System.out.print("" + System.lineSeparator() + "");
        System.out.println("1." + option1);
        System.out.print("" + System.lineSeparator() + "");
        System.out.println("2." + option2);
        System.out.print("" + System.lineSeparator() + "");
        System.out.println("3." + option3);
        System.out.print("" + System.lineSeparator() + "");
        System.out.println("4." + option4);
        System.out.print("" + System.lineSeparator() + "");
        while (true) {
            System.out.println("Please select an option between 1-4");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Deposit Amount:");
                double money = scanner.nextDouble();
                System.out.println(money);

            } else if (choice == 2) {
                System.out.println("Check Balance selected:");
            } else if (choice == 3) {
                System.out.println("Withdraw selected:");
            } else if (choice == 4) {
                System.out.println("Application now exciting");
            }
            System.exit(4);// This will end the program.
        }
    }
}
