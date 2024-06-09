package chapter2;

public class TypeInference {

	public static void main(String[] args) {
		// 자바 10부터 기능 제공
		
		var i = 10; // int i  = 10으로 컴파일됨
		var j = 10.0; // double j = 10.0으로 컴파일됨
		var str = "hello"; // String str = "hello"로 컴파일됨
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test"; // 다른 문자열 대입 가능
		// str = 3; 정수 대입 불가능. str 변수는 String형으로 먼저 사용했기 때문에
		System.out.println(str);
	}

}
