import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= n - i + 1; j--) {
                System.out.print(j);
                if (j > n - i + 1) System.out.print(" "); // space between numbers
            }
            System.out.println();
        }
    }
}