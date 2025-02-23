package Start;
import java.util.Scanner;
import java.util.Arrays;
public class element_insert {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = s.nextInt(), arr[] = new int[n + 1];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) arr[i] = s.nextInt();

        System.out.println("Enter element to insert and position (0-based index):");
        int element = s.nextInt(), pos = s.nextInt();

        if (pos < 0 || pos > n) System.out.println("Invalid position!");
        else {
            for (int i = n; i > pos; i--) arr[i] = arr[i - 1];
            arr[pos] = element;
            System.out.println("Updated Array: " + Arrays.toString(arr));
        }
        s.close();
    }

}
