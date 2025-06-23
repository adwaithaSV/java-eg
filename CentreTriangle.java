package tcs;
import java.util.*;
public class CentreTriangle {
	public static void main(String args[]) {
		char c='*';
		int n;
		System.out.println("Enter N value");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(c);
				System.out.print(" ");
			
			}
			System.out.print('\n');
		}
		
	}
}
