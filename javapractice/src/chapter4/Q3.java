package chapter4;

public class Q3 {

	public static void main(String[] args) {
		// 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력
		// break문 사용
		
		int dan = 2;
		int times = 0;
		int result = 0;
		
		for(dan = 1; dan <= 9; dan++) {
				for(times = 1; times <= 9; times++) {
					if(dan < times) 
						break;
					result = dan*times;
					System.out.println(dan + "*" + times + " = " + result);
			}
				System.out.println();
		}
	}
}
