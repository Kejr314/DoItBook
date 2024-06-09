package inheritance;

public class CustomerTest2 {
	public static void main(String[] args) {
		// super(); 컴파일러가 자동으로 추가하는 코드. 상위 클래스의 Customer()가 호출됨
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
	}
}
