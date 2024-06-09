package chapter2;

public class DoubleEx1 {

	public static void main(String[] args) {
		double dnum1 = 3.14;
		float fnum = 3.14F;
		
		System.out.println(dnum1); // 3.14
		System.out.println(fnum); // 3.14
		
		// 한 걸음 더!
		// 부동 소수점 방식의 오류
		
		double dnum2 = 1;
		
		for(int i = 0; i < 10000; i++) {
			dnum2 = dnum2 + 0.1;
		}
		System.out.println(dnum2); // 1001.000000000159
	}
}
	
