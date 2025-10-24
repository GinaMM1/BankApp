
public class Fixed 

    BrokenLoop {

    public static int findNegativeSum(int[] numbers) {
        int sum = 0;

        // Sum all negative numbers
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                sum += numbers[i];
            }
        }

        // Check for zero in the array
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                return sum;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] data = {3, -2, 0, -5, 7};
        System.out.println("Negative sum: " + findNegativeSum(data));
    }
}
