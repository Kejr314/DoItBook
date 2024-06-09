package operator;

public class OperationEx4 {
	public static void main(String[] args) {
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		ch = (fatherAge > motherAge) ? 'T' : 'F'; // 조건식 ? 참 : 거짓
		
		System.out.println(ch); // F
	}
}
