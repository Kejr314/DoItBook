package operator;

public class OperationEx3 {
	public static void main(String[] args) {
		int num1 = 10;
		int i1 = 2;
		
		boolean value1 = ((num1 = num1 + 10) < 10) && ((i1 = i1 + 2) < 10); // 20 < 10
		System.out.println(value1); // false
		System.out.println(num1); // 20
		System.out.println(i1); // 2 <- 논리 곱에서 앞 항이 거짓이면 뒷 항이 실행되지 않아 i 값은 그대로
		
		value1 = ((num1 = num1 + 10) > 10) || ((i1 = i1 +2) < 10); // 30 > 10
		System.out.println(value1); // true
		System.out.println(num1); // 30
		System.out.println(i1); // 2 -< 논리 합에서 앞 항이 참이면 뒷 항이 실행되지 않아 i 값은 그대로
		
		// 1분 복습
		System.out.println();
		
		int num = 5;
		int i = 10;
		
		boolean value = ((num = num * 10) > 45) || ((i = i - 5) < 10);
		System.out.println(value); 
		System.out.println(num); 
		System.out.println(i);
		
	}
}
