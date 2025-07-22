import java.io.*;
public class Narrow {
	public static void main(String args[]) {
		double d = 100.245;
		short s = (short) d;
		int i = (int) d;
		System.out.println("Original Value: "+d);
		System.out.println("Short: "+s);
		System.out.println("Integer: "+i);
	}
}