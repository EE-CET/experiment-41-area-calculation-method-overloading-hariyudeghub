import java.util.Scanner;

public class AreaCalculator {

    static float calculateArea(float radius) {
        return 3.14159f * radius * radius;
    }

    static float calculateArea(float length, float breadth) {
        return length * breadth;
    }

    static double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float radius = sc.nextFloat();
        float length = sc.nextFloat();
        float breadth = sc.nextFloat();
        double base = sc.nextDouble();
        double height = sc.nextDouble();

        System.out.printf("%.2f\n", calculateArea(radius));
        System.out.printf("%.2f\n", calculateArea(length, breadth));
        System.out.printf("%.2f\n", calculateArea(base, height));

        sc.close();
    }
}
