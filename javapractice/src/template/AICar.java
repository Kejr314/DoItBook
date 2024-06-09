package template;

public class AICar extends Car {

	// 추상 메서드
	@Override
	public void drive() {
		System.out.println("자율 주행합니다.");
		System.out.println("자동차가 알아서 방향을 전환합니다.");
	}

	// 추상 메서드
	@Override
	public void stop() {
		System.out.println("스스로 멈춥니다.");
	}
}
