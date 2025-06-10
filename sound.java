package demo;
public class sound{
	void speak(String a) {
		System.out.println("Bow Bow");
	}
	void speak(String a, int b) {
		System.out.println("Meow");
	}
	public void speak(String a ,double b) {
		System.out.println("Quack");
	}
	public static void main(String args[]) {
		sound obj= new sound();
		obj.speak("Bow");
		obj.speak("Cat", 2);
		obj.speak("Duck",6.2);
	}
}
