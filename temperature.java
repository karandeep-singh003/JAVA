package Start;
import java.util.Scanner;
public class temperature {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Celsius: " + ((s.nextDouble() - 32) * 5 / 9));
        s.close();
    }
}
