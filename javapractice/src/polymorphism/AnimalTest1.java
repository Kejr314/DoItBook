package polymorphism;

class Animal1 {
	public void move1() {
		System.out.println("동물이 움직입니다.");
	}
}
class Human1 extends Animal1 {
	public void move1() { // move() 재정의(오버라이딩)
		System.out.println("사람이 두 발로 걷습니다."); 
	}
}

class Tiger1 extends Animal1 {
	public void move1() { // move() 재정의(오버라이딩)
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
}

class Eagle1 extends Animal1 {
	public void move1() { // move() 재정의(오버라이딩)
		System.out.println("독수리가 하늘을 납니다.");
	}
}

public class AnimalTest1 {
	public static void main(String[] args) {
		AnimalTest1 aTest1 = new AnimalTest1();
		aTest1.moveAnimal1(new Human1());
		aTest1.moveAnimal1(new Tiger1());
		aTest1.moveAnimal1(new Eagle1());
	}
	
	public void moveAnimal1(Animal1 animal1) { // 매개변수의 자료형이 상위 클래스, Animal 타입의 객체를 매개변수로 받습니다.
		animal1.move1(); // 재정의된 메서드
	}
}
