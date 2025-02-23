// FACTORIAL OF A NUMBER 
package Start;
import java.util.Scanner;
public class factorial {
		static int factoriall(int n) {
		    if (n == 0 || n == 1) return 1;  
		    return n * factoriall(n - 1);     // Recursive call
		}
			public static void main (String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the number of your choice :");
				int num = sc.nextInt();
				if (num<0) {
					System.out.println("Factorial is not defined for negative values ");
				}else {
					System.out.println("Factorial of "+ num+ "is "+factoriall(num));
				}
				sc.close();
				}
	}
