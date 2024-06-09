package generics;

public class Point<T, V> { // 자료형 매개변수
	T x; 
	V y;
	
	Point(T x, V y){
		this.x = x;
		this.y = y;
	}
	
	// 제네릭 메서드, T와 V를 반환하고 있음
	public T getX() {
		return x;
	}
	public V getY() {
		return y;
	}
}
