package Institution;

public class Student extends Department{
	public void studentname() {
		System.out.println("teena");
	}
	public void  studentdepartment() {
		System.out.println("ECE");
	}
	public void studentid() {
		System.out.println("32");
	}
	public static void main(String[] args) {
		Student bb=new Student();
				bb.collegename();
		bb.collegecode();
		bb.collegerank();
		bb.department();
		bb.studentname();bb.studentid();bb.studentdepartment();
	}
}
