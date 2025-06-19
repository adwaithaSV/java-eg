package tcs;
import java.util.Scanner;
public class Oddchar {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		char ch=str.charAt(0);
		int k =str.length();
		for(int i=0;i<k;i++) {
			if(i%2==1) {
				System.out.print(str.charAt(i));
			}
		}
	}
}
