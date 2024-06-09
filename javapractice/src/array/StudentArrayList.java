package array;

import java.util.*;

public class StudentArrayList {

	public static void main(String[] args) {
		ArrayList<Student> school = new ArrayList<Student>(); 
		
		school.add(new Student("1001", "James"));
		school.add(new Student("1002", "Tomas"));
		school.add(new Student("1003", "Edward"));
		
//		for(int i = 0; i < school.size(); i++) {
//			Student student = school.get(i);
//			student.showStudentInfo();
//		}
//		System.out.println();
		
		for(Student student : school) {
			student.showStudentInfo();
		}
	}
}
