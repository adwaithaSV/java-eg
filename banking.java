package demo;
import java.util.*;
class bank{
	private int amount=2000;
	public int getamount() {
		return amount;
	}
	public void setamount(int deposit) {
		this.amount=amount+deposit;
	}
}
public class banking {
	public static void main(String args[]) {
		int deposit, result;
		Scanner s=new Scanner(System.in);
		deposit=s.nextInt();
		bank b=new bank();
		b.setamount(deposit);
		result = b.getamount();
		System.out.println("Amount balance:"+result);
	}
}
 