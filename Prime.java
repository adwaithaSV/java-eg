package demo;
import java.util.*;
public class Prime {
	public static void main(String args[]) {
		int n,i,a;
		double y;
		a=0;
		System.out.println("Enter the number to check the prime");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(i=1;i<=n;i++) {
			y=n%i;
			if(y==0) {
				a++;
			}
		}
		if(a==2) {
			System.out.println("YES the number entered is prime number");
			}
		else {
			System.out.println("No the number entered is not a prime number");
		}
	}
}
