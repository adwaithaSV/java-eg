package demo;
import java.util.*;
public class Table {
	public static void main(String args[]) {
		int i,j,k=1;
		for(i=1;i<=10;i++) {
			for(j=1;j<=10;j++) {
				k=i*j;
				System.out.println(i+"*"+j+"="+k);
			}
		}
	}
}
