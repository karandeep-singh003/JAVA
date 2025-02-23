package Start;
import java.util.Scanner;
import java.util.Arrays;
public class copyarray {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = s.nextInt(), arr[] = new int[n], copy[] = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) copy[i] = arr[i] = s.nextInt();

        System.out.println("Copied Array: " + Arrays.toString(copy));
        s.close();
    }

}
