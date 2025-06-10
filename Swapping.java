package demo;
import java.util.*;
public class Swapping {
	public static void main(String args[]) {
		//With Third variable
		int a,b,c;
		c=0;
		System.out.println("Enter two number to swap");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("BEFORE SWAPPING");
		System.out.println("1st number:"+a);
		System.out.println("2nd number:"+b);
		c=a;
		a=b;
		b=c;
		System.out.println("AFTER SWAPPING");
		System.out.println("Now 1st number:"+a);
		System.out.println("Now 2nd number:"+b);
		//without 3rd variable
		int x,y;
		System.out.println("Enter Numbers to Swap");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("BEFORE SWAPPING");
		System.out.println("1st value:"+x);
		System.out.println("2nd value"+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("AFTER SWAPPING");
		System.out.println("1st value"+x);
		System.out.println("2nd value"+y);
	}
}
