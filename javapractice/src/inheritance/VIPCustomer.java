package inheritance;

// 새로운 고객 등급이 필요한 경우

public class VIPCustomer extends Customer { // VIPCustomer 클래스는 Customer 클래스를 상속 받음
	private int agentID; // VIP 고객 상담원 아이디
	double saleRatio; // 할인율
//	int bonusPoint;
	
	public VIPCustomer(){
		super(0, ""); // 기본 생성자에서 상위 클래스 생성자 호출
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName); // 상위 클래스 생성자 호출
		customerGrade = "VIP"; // 상위 클래스에서 private 변수로 선언하면 오류 발생함
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
//		System.out.println("VIPCustomer() 생성자 호출"); // 하위 클래스 생성할 때 콘솔 출력문
	}

	public int getAgentID(){
		return agentID;
	}

	// 재정의한 메서드
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio); // 할인된 가격을 계산하여 반환
	}
	// 재정의한 메서드
	public String showCustomerinfo() { // 고객 정보 출력 메서드 재정의
		return super.showCustomerInfo() + "담당 상담원 번호는 " + agentID + "입니다."; // 상담원 번호 추가 출력
	}
}

//public class VIPCustomer {
//	// 멤버 변수, Customer 클래스와 겹침
//	private int customerID;
//	private String customerName;
//	private String customerGrade;
//	int bonusPoint;
//	double bonusRatio;ㅋ
//	
//	// VIP 고객 관련 기능을 구현할 때만 필요한 멤버 변수
//	private int agentID; // VIP 고객 담당 상담원
//	double saleRatio; // 할인율
//	
//	// 디폴트 생성자
//	public VIPCustomer()
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//		saleRatio = 0.1;
//	}
//
//	// Customer 클래스와 메서드 이름은 동일하지만, 구현 내용은 다름 > 일반 고객에게 제공하는 혜택 기본으로 제공 + 추가 속성 메서드
//	public int calcPrice(int price) {
//		bonusPoint += price * bonusRatio;
//		return price - (int)(price * bonusRatio); // 할인율 적용
//	}
//	
//	public int getAgent() {
//		return agentID;
//	}
//	
//	public String showCustomerInfo() {
//		return customerName + " 님의 등급은" + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
//	}
//
//}
