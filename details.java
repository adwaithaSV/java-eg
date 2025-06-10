package demo;
class school{
	public String School_Name="Amrita_School";
	public class student{
		public String Name="Adwaitha";
		private int age=17;
		protected String Grade="XII-A";
	
		public void info() {
			System.out.println("School:"+School_Name);
			System.out.println("Student Name:"+Name);
			System.out.println("Grade:"+Grade);
			System.out.println("Age:"+age);
		}
	}
}
public class details {
	public static void main(String args[]) {
		school sc=new school();
		school.student s= sc.new student();
		s.info();
	}
}
