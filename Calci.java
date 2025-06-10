package demo;
import java.util.*;
public class Calci {
	public static void main(String args[]) {
		int a,b,c,n;
		System.out.println("Lets Do Simple Mathmatical Opertation");
		while(true) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the value 1");
			a=s.nextInt();	
			System.out.println("Enter the value 2");
			b=s.nextInt();
			System.out.println("Choose the value from 1-4");
			System.out.println("1 for addition\n2 for subtraction\n3 for multiplication\n4 for division");
			n=s.nextInt();
			switch(n) {
			case 1:
				c=a+b;
				System.out.println(c);
				break;
			case 2:
				c=a-b;
				System.out.println(c);
				break;
			case 3:
				c=a*b;
				System.out.println(c);
				break;
			case 4:
				c=a/b;
				System.out.println(c);
				break;
			default:
				System.out.println("Invalid");
				break;
			}
		}
	}
}
