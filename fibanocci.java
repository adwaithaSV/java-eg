package demo;
import java.util.*;
public class fibanocci {
	public static void main(String args[]) {
		int val1 = 0,val2=1,nextval = 0,n;
		System.out.println("Enter the n number for the series");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		System.out.println(val1);
		for(int i=0;i<=n;i++) {
			nextval=val1+val2;
			val1=val2;
			val2=nextval;
			System.out.println(nextval);
		}
	}
}
