package thisex;

class Person {
	String name;
	int age;
	
	Person(){
		this("이름 없음", 1); // this를 사용해서 Person(String name, int age) 호출
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Person returnItSelf() { // 반환은 클래스형 Person
		return this; // this 반환
	}
}
public class CallAnotherConst {
	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p = noName.returnItSelf(); // this 값을 클래스 변수에 대입
		System.out.println(p); // noNmae.returnItSelf() 반환 값 출력
		System.out.println(noName); // 참조 변수 출력
		// 클래스 내에서 this를 사용하면 자신의 주소 값을 반환할 수 있음
	}
}
