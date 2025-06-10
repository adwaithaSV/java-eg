package demo;
import java.util.*;
public class Palindrome {
	public static void main(String args[]) {
		String input;
		String rev="";
		int i;
		System.out.println("Enter the input string");
		Scanner s=new Scanner(System.in);
		input=s.nextLine();
		System.out.println("The Entered String is :"+input);
		for(i=input.length()-1;i>=0;i--) {
			rev +=input.charAt(i);
		}
		System.out.println("the reversed string is :"+rev);
		if(input.contentEquals(rev)) {
			System.out.println("palindrome  String");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}
}
