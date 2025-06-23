package tcs;
import java.util.Scanner;
public class Lefttriangle {
	public static void main(String args[]) {
		System.out.println("Enter the value of n");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
}
