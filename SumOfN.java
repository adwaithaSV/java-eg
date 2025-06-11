package demo;
import java.util.*;
public class SumOfN {
	public static void main(String args[]) {
		int n,sum;
		while(true) {
			System.out.println("Enter the value of N");
			Scanner s=new Scanner(System.in);
			n=s.nextInt();
			sum=(n*(n+1))/2;
			System.out.println(sum);
		}
	}
}
