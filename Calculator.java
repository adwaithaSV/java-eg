package machineTest;
import java.util.*;
class Calci {
	 static void add(int a, int b) {
		System.out.println(a+b);
	}
	 static void sub(int a, int b) {
		System.out.println(a-b);
	}
	 static void multiply(int a, int b) {
		System.out.println(a*b);
	}
	 static void divide(int a, int b) {
		System.out.println(a/b);
	}
}
public class Calculator extends Calci {
	public static void main(String args[]) {
		int a,b,op;
		while(true) {
			System.out.println("Enter the 1st Value");
			Scanner s=new Scanner(System.in);
			a=s.nextInt();
			System.out.println("Enter the 2nd value");
			b=s.nextInt();
			System.out.println("SELECT THE OPERATION TO PERFORM\nEnter 1 for Addition\nEnter 2 for Subtraction\nEnter 3 for Multiplication\nEnter 4 for division");
			op=s.nextInt();
			switch(op) {
			case 1:
				add(a,b);
				break;
			case 2:
				sub(a,b);
				break;
			case 3:
				multiply(a,b);
				break;
			case 4:
				if(b==0) {
					System.out.println("Can't Divide By Zero");
				}
				else {
					divide(a,b);
				}
				break;
			default:
				System.out.println("Enter valid Number");
			}
		}
	}
}
