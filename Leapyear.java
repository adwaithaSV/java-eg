package demo;
import java.util.*;
public class Leapyear {
	public static void main(String args[]) {
		int year;
		System.out.println("Enter the year");
		Scanner s=new Scanner(System.in);
		year=s.nextInt();
		if(year%4==0) {
			System.out.println("Leap year");
		}
		else {
			System.out.println("NOT a leap year");
		}
	}
}
