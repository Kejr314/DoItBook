package chapter4;

public class Q2 {

	public static void main(String[] args) {
		// 구구단 짝수단만 출력
		// continue문 사용
		
		int dan = 0;
		int times = 0;
		int result = 0;
		
		for(dan = 2; dan <= 9; dan++) {
			if(dan%2 != 0) // dan이 홀수인 경우
			continue; // 이후 수행 생략 후 dan++ 수행
			for(times = 1; times <= 9; times++) {
				result = dan * times;	
				System.out.println(dan + "X" + times + "=" + result);
			}
			System.out.println();
		}
	}
}
