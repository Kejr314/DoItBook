package operator;

public class OperationEx1 {
	public static void main(String [] args) {
		int mathScore = 90;
		int engScore = 70;
		
		int totalScore = mathScore + engScore;
		System.out.println(totalScore); // 160
		
		double avgScore = totalScore / 2.0; 
		System.out.println(avgScore); // 80
		
		// 1분 복습
		
		int koScore = 100;
		
		int totalScore1 = totalScore + koScore;
		System.out.println(totalScore1); // 260
		
		double avgScore1 = totalScore1 / 3.0;
		System.out.println(avgScore1); // 86.66...
	}
}
