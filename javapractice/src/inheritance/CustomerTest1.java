package inheritance;

public class CustomerTest1 {
	public static void main(String[] args) {
		
		// 새로운 Customer 클래스 생성. customerLee 참조 변수에 대입
		Customer customerLee = new Customer(); 
		// customerID와 customerName은 protected의 변수이므로 set() 메서드 호출
		customerLee.setCustomerID(10010); // 값을 지정
		customerLee.setCustomerName("이순신");
		
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		// VIPCustomer 클래스 생성. customerKim 참조 변수에 대입
		VIPCustomer customerKim = new VIPCustomer(); // VIPCustomer 클래스 생성. customerKim 참조 변수에 대입
		// customerID와 customerName은 protected의 변수이므로 set() 메서드 호출
		customerKim.setCustomerID(1020);
		customerKim.setCustomerName("김유신");
		
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
	}

}
