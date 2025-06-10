package demo;
class Student{
	int mark1=60;
	int mark2=65;
}
public class teacher extends Student {
	String subject1 = "maths";
	String subject2="Chemistry";
	public static void main(String args[]) {
		teacher t1= new teacher();
		teacher t2=new teacher();
		System.out.println(t1.subject1+"="+t1.mark1);
		System.out.println(t2.subject2+"="+t2.mark2);
	}
}
