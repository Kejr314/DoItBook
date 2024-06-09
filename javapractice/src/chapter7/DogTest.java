package chapter7;

public class DogTest {

	public static void main(String[] args) {
		
		Dog[] dogArray = new Dog[5];
		dogArray[0] = new Dog("페니", "베들링턴 테리어");
		dogArray[1] = new Dog("구리", "비글");
		dogArray[2] = new Dog("멍멍이", "푸들");
		dogArray[3] = new Dog("흰둥이", "포메라니안");
		dogArray[4] = new Dog("댕댕이", "보더콜리");
		
		for(int i =0; i<dogArray.length; i++) {
			System.out.println(dogArray[i].showDogInfo());
		}
		
		System.out.println("===================================================");
		
		for(Dog dog : dogArray) {
			System.out.println(dog.showDogInfo());
		}
	}
}
