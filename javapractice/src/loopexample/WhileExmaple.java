package loopexample;

public class WhileExmaple {

	public static void main(String[] args) {
		int num = 1; // 변수를 사용하여 연산을 하거나 그 값을 가져다 사용하려면 변수는 반드시 어떤 값을 가지고 있어야 함
		int sum = 0;
	
		while(num <= 10) {
			sum += num;
			num++; // num에 1씩 더해 나감
		}
		System.out.println("1부터 10까지의 합은" + sum + "입니다.");
	}

}
