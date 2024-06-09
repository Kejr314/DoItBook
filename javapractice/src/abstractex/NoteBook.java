package abstractex;

public abstract class NoteBook extends Computer { // 추상 메서드가 하나이기 때문에 추상 클래스가 됨
	
	@Override
	public void display() {
		System.out.println("NoteBook display()");
	}
}
