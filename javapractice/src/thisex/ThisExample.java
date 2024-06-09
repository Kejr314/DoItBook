package thisex;

// 객체를 코드로 만든 클래스
class Birthday {
	int day;
	int month;
	int year;

	public void setYear(int year) { // 태어난 연도를 지정하는 메서드
		this.year = year; // bDay.year = year; 과 같음
	}
	
	public void printThis() { // this 출력하는 메서드
		System.out.println(this); // System.out.pringln(bDay); 와 같음
	}
}

// this 출력 값의 의미를 알기 위해 main() 함수를 포함하여 만든 테스트용 클래스
public class ThisExample {
	public static void main(String[] args) {
		Birthday bDay = new Birthday();
		bDay.setYear(2000); // 태어난 연도 : 2000
		System.out.println(bDay); // 참조 변수 출력
		bDay.printThis(); // this 메서드 호출
	}
}

// 스택 메모리 : SetYear()[this] + main [bDay, args]
// 힙 메모리 : BirthDay 클래스 생성, [year, month, day]