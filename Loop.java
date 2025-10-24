
import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int number = scanner.nextInt();

        System.out.println(number + "Times table");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "x" + number + "=" + (number * i));
        }
        scanner.close();
    }
}
