package loopexample;

public class BreakExample2 {

	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		
		for(num = 0; ; num++) { // 조건문 생략하는 대신 break문 사용
			sum += num;
			if(sum >=100) // 100보다 크거나 같을 때 (종료 조건)
				break; // 반복문 중단
		}
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);
	}

}
