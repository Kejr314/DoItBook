package abstractex;

public abstract class Computer {  // class를 추상 클래스로 선언해야 display(), typing()의 abstract 예약어 추가 시 오류 발생 안함
	public abstract void display(); 
	public abstract void typing();
	// 전원을 끄고 켜는 turnOn()과 turnOff()의 구현은 하위 클래스에서 공유할 수 있지만,
	// display()와 typing()의 구현 내용은 NoteBook 인지 DeskTop인지 달라지므로 Computer 클래스에 구현하지 않음
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
