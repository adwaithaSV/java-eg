package demo;
abstract class vehicle{
	abstract void running ();
}
class cycle extends vehicle{
	public void running() {
		System.out.println("Doesn't requires fuel");
	}
}
class bike extends vehicle{
	public void running() {
		System.out.println("Its requires fuel");
	}
}
public class Fuel {
	public static void main(String args[]) {
		cycle c=new cycle();
		c.running();
		bike b=new bike();
		b.running();
	}
}