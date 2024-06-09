package chapter4;

public class Q4 {

	public static void main(String[] args) {
//		     *
//		   * * *
//		  * * * * *
//		* * * * * * *
		
	int lineCount = 4;
	int starCount = 1;
	int spaceCount = lineCount/2 +1;
	
	for(int i = 0; i<lineCount; i++) { // j의 유효 범위는 각 for문 안에서만 유효함. 별개의 변수 j임
		for(int j = 0; j<spaceCount; j++ ) { // left
			System.out.print(" ");
		}
		for(int j = 0; j<starCount; j++) {
			System.out.print("*");
		}
		for(int j = 0; j<spaceCount; j++) { // right
			System.out.print(" ");
		}
		spaceCount -= 1; // " " right, left 각각 1개씩 감소
		starCount += 2; // * 2개씩 증가
		System.out.println();
	}
	
	}
}
