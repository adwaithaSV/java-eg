package demo;
import java.util.*;
public class Sum {
	public static void main(String args[]) {
		int a,b,x,y;
		System.out.println("Enter the 2 numbers");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		System.out.println("1st number entered; Enter next number");
		b=s.nextInt();
		x=a+b;
		System.out.println("Sum of the number is :"+x);
		if(a>b) {
			y=a-b;
			System.out.println("The difference is:"+y);
		}
		else if(b>a) {
			y=b-a;
			System.out.println("The difference is:"+y);
		}
		else {
			System.out.println("Enter valid number");
		}
	}
}
