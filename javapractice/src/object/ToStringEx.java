package object;

class Book {
	int bookNumber;
	String bookTitle;
	
	// 책번호와 제목을 매개 변수로 입력받는 생성자
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
}

public class ToStringEx {
	public static void main(String [] args) {
		Book book1 = new Book(200, "개미");
		
		System.out.println(book1); // 인스턴스 정보(클래스 이름, 주소값) -> 자동으로 toString 메서드 호출됨, 자동 호출된 toString 메서드는 Object 클래스의 메서드
		// Object 클래스의 toString 메서드 : getClass().getName() + '@' + Integer.toHexString(hashCode)) = 클래스 이름 @ 해시 코드 값
		System.out.println(book1.toString()); // toString() 메서드로 인스턴스 정보(클래스 이름, 주소값)을 보여줌
		
		// 출력 결과
		// operator.Book@5e91993f
		// operator.Book@5e91993f
	}
}
