package demo;
import java.util.*;
class vehicles{
	static String move="Ready to Travel";
	static class taxi{
		void travel() {
			System.out.println(move);
			System.out.println("Taxi booked");
		}
	}
	class audi{
		private int id=2931, n;
		void go() {
			System.out.println("Enter the id for access");
			Scanner s=new Scanner(System.in);
			n=s.nextInt();
			if(n==id) {
				System.out.println(move);
				System.out.println("Access Granted; Happy journey");
			}
			else {
				System.out.println("Access Denied; Car Not Available");
			}
		}
	}
}
public class bookcar {
	public static void main(String args[]) {
		int x;
		vehicles .taxi t=new vehicles .taxi();
		vehicles v=new vehicles();
		vehicles.audi own =v.new audi();
		System.out.println("Enter value 1 if you are a owner of the car else enter 2");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		
		switch(x) {
		case 1:
			System.out.println("Hello Owner");
			own.go();
			break;
		case 2:
			System.out.println("BOOKING TAXI");
			t.travel();
			break;
		default:
			System.out.println("ERROR");
			break;
		}
	}
}

