package loopexample;

public class ContinueExample {

	public static void main(String[] args) {
		int total = 0;
		int num;
		
		for(num = 1; num <= 100; num++) {
			if(num % 2 == 0) // num이 짝수인 경우
			continue; // 수행 생략하고 num++ 수행
			total += num; // num이 홀수인 경우에만 수행
		}
		System.out.println("1부터 100까지의 홀수의 합은 : " + total + "입니다.");
	}

}
