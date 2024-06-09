package chapter7;

public class Q3 {
// 배열 길이가 5인 정수형 배열을 선언하고, 1 ~ 10 중 짝수만을 배열에 저장한 후 그 합을 출력하세요.
	public static void main(String[] args) {
		
		int[] number = new int[] {2,4,6,8,10};
		int total = 0;
					
		for(int i=0; i<number.length; i++){
			total += number[i];
		}
		
		System.out.println("2부터 10까지 짝수의 합은 " + total + "입니다");
	}
}
 