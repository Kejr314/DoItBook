package abstractex;

public class DeskTop extends Computer{
	// 추상 클래스를 상속받는 클래스 > 추상 클래스가 가진 메서드 상속 받음
	// 따라서, 상속받은 클래스는 추상 메서드를 포함
	// < 해결 방안 >
	// 1. 추상 메서드 모두 구현
	// 2. DeskTop 클래스를 추상 클래스로 만들기

//	추상 메서드인 display()와 typing()을 재정의
	@Override
	public void display() {
		System.out.println("DeskTop display()");
	}

	@Override
	public void typing() {
		System.out.println("DeskTop typing()");
	}

}
