package Start;
import java.util.Scanner;
public class Quadraticequationsolver {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter coefficients a, b, c:");
        double a = s.nextDouble(), b = s.nextDouble(), c = s.nextDouble();

        double d = b * b - 4 * a * c; // Discriminant

        if (d > 0) {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Roots: " + r1 + " , " + r2);
        } else if (d == 0) {
            System.out.println("Root: " + (-b / (2 * a)));
        } else {
            System.out.println("No real roots");
        }
        s.close();
    }
}
