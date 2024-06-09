package array;

// 객체 배열 만들기 2
// Book 클래스형으로 객체 배열 생성  

public class BookArray {

	public static void main(String[] args) {
		Book[] library = new Book[5]; // Book 주소 값을 담을 공간이 5개 만들어짐. 
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
			//자동으로 각 공간은 비어있음으로 null 값으로 초기화됨
		}
	}

}

//		library[0]		library[1]		library[2]		library[3]		library[4]
//	[	   null		][	   null		][	   null		][	   null		][	   null		]			