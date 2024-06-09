package operator;

public class OperationEx5 {
	public static void main(String[] args) {
		int num = 0B00000101; // 2진수, 10진수 = 5
		
		System.out.println(num << 2); // 0B00010100, 10진수 = 20
		System.out.println(num >> 2); // 0B0000001, 10진수 = 1
		System.out.println(num >>> 2); // 0B0000001, 10진수 = 1
		
		System.out.println(num); // 0B00000101, 10진수 = 5
		
		num = num << 2;
		System.out.println(num); // 0B00010100, 10진수 = 20
	}
}
