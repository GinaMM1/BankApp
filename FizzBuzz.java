
public class FizzBuzz {

    public static void main(String[] args) {
        // We need a loop that goes from 1 to 100 inclusive.
        for (int i = 1; i <= 100; i++) {

            // First, check for the most specific condition: divisible by both 3 and 5.
            // A number is divisible by both if it's divisible by their least common multiple, which is 15.
            // Using i % 15 == 0 is also a valid and efficient way to check this.
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } // If not, then check if it's divisible by 3.
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            } // If not divisible by 3, then check if it's divisible by 5.
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            } // If none of the above conditions are true, just print the number itself.
            else {
                System.out.println(i);
            }
        }
    }
}
