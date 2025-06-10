package demo;
interface bird{
	void isbird();
}
interface animal{
	void cantfly();
}
class hybrid implements bird, animal{
	public void isbird() {
		System.out.println("YES it is a Bird");
	}
	public void cantfly() {
		System.out.println("Can't fly");
	}
}
public class penquin {
	public static void main(String args[]) {
		hybrid h=new hybrid();
		h.isbird();
		h.cantfly();
	}
}
