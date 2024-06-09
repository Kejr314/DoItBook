package chapter4;

public class Q1 {

	public static void main(String[] args) {
		int num1 = 7;
		int num2 = 0;
		char operator = '/';
		int result = 0;
		
		switch(operator) {
		case '+' :
			result = num1 + num2;
			break;
		case '-' :
			result = num1 - num2;
			break;
		case '*' :
			result = num1 * num2;
			break;
		case '/' :
			result = num1 / num2;
			if(num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
			}
		}
		System.out.printf("%d %s %d = %d", num1, operator, num2, result);
	}

}
