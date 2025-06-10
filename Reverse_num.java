package demo;
import java.util.*;
public class Reverse_num {
	public static void main(String args[]) {
		int i;
		String c;
		String r="";
		System.out.println("Enter the string to reverse :");
		Scanner s=new Scanner(System.in);
		c=s.nextLine();
		System.out.println("The Entered String is: "+c);
		for(i=c.length()-1;i>=0;i--) {
			r+=c.charAt(i);
		}
		System.out.println("Reveresed String is :"+r);
	}
}
