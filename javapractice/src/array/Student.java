package array;

public class Student {

	private String studentID;
	private String name;
	
	public Student(String studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}
	
	////////////////////////////////////////////////////////
	// get() 메서드 구현
	public String getstudentID() {
		return studentID;
	}
	// set() 메서드 구현
	public void setstudentID(String studentID) {
		this.studentID = studentID;
	}
	
	////////////////////////////////////////////////////////
	// get() 메서드 구현
	public String getname() {
		return name;
	}
	// set() 메서드 구현
	public void setname(String name) {
		this.name = name;
	}
	
	////////////////////////////////////////////////////////
	public void showStudentInfo() {
		System.out.println(studentID + ", " + name);
	}
	
	//@Override
    public String toString() {
        return studentID + "," + name;
    }
}
