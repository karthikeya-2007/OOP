import java.util.Scanner;
public class PerfectNumber {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<n;i++) {
            if(n%i==0){
            sum+=i;
            }
        }
        if(n==sum){
        System.out.println("It is a perfect number.");
        }
        else { 
        System.out.println("It is not a perfect number.");
        }
    }
}