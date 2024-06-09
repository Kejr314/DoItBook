package witharraylist;

public class Customer {
	
	protected int customerID; // 고객 아이디
	protected String customerName; // 고객 이름
	protected String customerGrade; // 고객 등급, default = Silver
	int bonusPoint; // 보너스 포인트 : 고객이 제품을 구매할 경우 누적되는 보너스 포인트
	double bonusRatio; // 적립 비율 : 보너스 포인트 적립 비율(기본 생성자에 지정되는 적립 비율 : 1%) 
	
	public Customer(){
		initCustomer(); // 고객 등급과 보너스 포인트 적립률 지정 함수 호출
	}
	
	// 멤버 변수 초기화
	private void initCustomer() { // 생성자에서만 호출하는 메서드, private
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}

	// protected 예약어로 선언한 변수를 외부에서 사용할 수 있도록 get(), set() 메서드 추가
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer(); // 고객 등급과 보너스 포인트 적립률 지정 함수 

	}
	
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public int getcustomerID() {
		return customerID;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스포인트는 " + bonusPoint + "입니다.";
	}
	public int calcPrice(int price) {
			bonusPoint += price * bonusRatio;
			return price;
	}
}
