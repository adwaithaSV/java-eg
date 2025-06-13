package demo;
public class Pyramid {
	public static void main(String args[]) {
		char a ='*';
		int n=6,j;
		for(int i=1;i<n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(a);
			}
			System.out.print('\n');
		}
	}
}
