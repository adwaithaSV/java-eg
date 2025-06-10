package demo;
import java.util.*;
public class Largernumber {
	public static void main(String args[]) {
	int a,b,c;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter 3 numbers");
	a=s.nextInt();
	b=s.nextInt();
	c=s.nextInt();
	if(a>b) {
		if( a>c) {
			System.out.println(a+"is greater");
		}
		else {
			System.out.println(c+"is greater");
		}
	}
	else if(c>b) {
		System.out.println(c+ "is greater");
		}
	else {
		System.out.println(b+ "is greater");
	}
	}
}
