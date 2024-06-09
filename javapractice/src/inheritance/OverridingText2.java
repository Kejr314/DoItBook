package inheritance;

public class OverridingText2 {

	public static void main(String[] args) {
		Customer vc = new VIPCustomer(1000, "나몰라", 2000); // VIP 고객 생성
		vc.bonusPoint = 1000;
		// 재정의된 메서드 calcPrice() 호출됨
		System.out.println(vc.getCustomerName() + "님이 지불해야하는 금액은 " + vc.calcPrice(10000) + "원입니다."); 
	}
}
