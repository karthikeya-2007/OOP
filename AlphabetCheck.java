import java.util.Scanner;
public class AlphabetCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		if(a>='A' && a<='Z' || a>='a' && a<='z') {
			System.out.println("It is Alphabet");
		}else {
			System.out.println("It is not Alphabet");
		}
	}
}