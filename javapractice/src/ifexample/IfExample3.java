package ifexample;

import java.util.*;

public class IfExample3 {

	public static void main(String[] args) {
		
		System.out.print("점수 입력 : ");
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		char grade;
		
		if(score >= 90 && score <= 100) {
			grade = 'A';
		}
		else if(score >= 80){
			grade = 'B';
		}
		else if(score >= 70){
			grade = 'C';
		}
		else if(score >= 60){
			grade = 'D';
		}
		else{
			grade = 'F';
		}
		System.out.println("학점 : " + grade);
	}

}
