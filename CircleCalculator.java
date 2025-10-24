
public class CircleCalculator {

    public static double calculateCircleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        double radius = 5.0;
        double circumference = calculateCircleCircumference(radius);
        System.out.println("Circumference:" + circumference);
    }
}
