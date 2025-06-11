package demo;
import java.util.*;
public class Isalpha {
	public static void main(String args[]) {
		char input;
		while(true) {
			System.out.println("Enter input to check");
			Scanner s=new Scanner(System.in);
			input =s.next().charAt(0);
			if((input>='a')&&(input<='z')||(input>='A')&&(input<='Z')) {
				System.out.println("IS a  ALPHABET");
			}
			else {
				System.out.println("NOT a ALPHABET");
			}
		}
	}

}
