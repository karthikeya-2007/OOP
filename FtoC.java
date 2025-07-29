import java.util.Scanner;
public class FtoC {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        float f = sc.nextFloat();
        float c;
        c = (f - 32) * 5.0f / 9.0f;
        System.out.println("Temperature after converting to C = " + c);
    }
}