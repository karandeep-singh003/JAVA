package Start;
import java.util.Scanner;
import java.util.Arrays;
public class removeelement {
	
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = s.nextInt(), arr[] = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) arr[i] = s.nextInt();

        System.out.println("Enter number to remove:");
        int target = s.nextInt(), index = -1;

        for (int i = 0; i < n; i++) if (arr[i] == target) { index = i; break; }

        if (index == -1) System.out.println("Number not found");
        else {
            int[] newArr = new int[n - 1];
            for (int i = 0, j = 0; i < n; i++) if (i != index) newArr[j++] = arr[i];
            System.out.println("Updated Array: " + Arrays.toString(newArr));
        }
        s.close();
    }
}
