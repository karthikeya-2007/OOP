import java.util.Scanner;
public class VowelConsonent {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U') {
			System.out.println("It is Vowel");
		}
		else {
			System.out.println("It is Consonent");
		}
	}
}