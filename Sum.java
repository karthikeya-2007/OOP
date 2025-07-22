import java.util.Scanner;
public class Sum {
	public static void main(String args[]) {
		int x,y,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x: ");
		x = sc.nextInt();
		System.out.println("Enter y: ");
		y = sc.nextInt();
		sum = x+y;
		System.out.println("Sum is " + sum);
	}
}