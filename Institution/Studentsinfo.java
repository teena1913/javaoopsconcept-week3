package Institution;

public class Studentsinfo {
	public void  getStudentInfo(int id,String name) {
		System.out.println(id+" "+name);
	}
	public void  getStudentInfo(String email,String phoneno) {
		System.out.println(email+" "+phoneno);
	}
	public static void main(String[] args) {
		Studentsinfo cc=new Studentsinfo();
		cc.getStudentInfo(32,"teena");
		cc.getStudentInfo("xxx@gmail.com","7639070107");
	}
}
