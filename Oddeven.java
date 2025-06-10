package demo;
import java.util.*;
public class Oddeven {
	public static void main(String args[]) {
		int a;
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the number to check odd/Even");
		a=s.nextInt();
		if(a%2==0) {
			System.out.println(a+" is a EVEN number");
		}
		else {
			System.out.println(a+" is a ODD number");
		}
	}
}
