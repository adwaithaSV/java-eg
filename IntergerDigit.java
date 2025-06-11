package demo;
import java.util.*;
public class IntergerDigit {
	public static void main(String agrs[]) {
		int x,res=1;
		System.out.println("Enter the value");
		Scanner s=new Scanner(System.in);
		x=s.nextInt();
		for(int i=1;i<x;i++) {
			if(x>10) {
				x=x/10;
				res=res+1;
			}
		}
		System.out.println(res);
	}
}
