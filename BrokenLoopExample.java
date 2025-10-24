
public class BrokenLoopExample {

    public static int findNegativeSum(int[] numbers) {
        int sum = 0;

        for (int i = 0; i <= numbers.length; i++) {
            if (numbers[i] < 0) {
                sum += numbers[i];
            }
        }

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
