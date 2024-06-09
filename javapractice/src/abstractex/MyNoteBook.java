package abstractex;

public class MyNoteBook extends NoteBook{ // 모든 추상 메서드가 구현된 클래스이므로 abstract 예약어 사용하지 않음

	@Override
	public void typing() {
		System.out.println("MyNoteBook typint()");
	}

} 
