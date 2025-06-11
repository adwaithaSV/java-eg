package demo;
import java.util.*;
public class Factorial {
	public static void main(String args[]) {
		int n,result=1;
		while(true) {
			System.out.println("Enter the value to find its Factorial");
			Scanner s= new Scanner (System.in);
			n=s.nextInt();
			for(int i=1;i<=n;i++) {
				result *=i;
			}
			System.out.println("RESULT ="+result);
			result=1;
		}
	}
}
