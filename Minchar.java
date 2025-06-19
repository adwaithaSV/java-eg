package tcs;
import java.util.Scanner;
public class Minchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		String str= s.next();
		String str1 = str.toLowerCase();
		char ch = str1.charAt(0);
		for(int i =0; i<str1.length();i++) {
			if(ch>str1.charAt(i)) {
				ch=str1.charAt(i);
			}
		}
		System.out.println(ch);
	}
}
