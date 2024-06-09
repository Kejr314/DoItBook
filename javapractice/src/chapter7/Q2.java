package chapter7;

public class Q2 {
	// 각 배열 요소 값을 소문자에서 대문자로 변환해 출력하세요.
	// A의 아스키 값은 65, a의 아스키 값은 97
	public static void main(String[] args) {
		
		char[] alpahabets = new char[26]; // A부터 Z까지
		char ch = 'A'; // 변수 초기화, 대문자 알바벳을 채우기 위해 사용
		
		// 대문자 알파벳 배열 초기화, A부터 Z까지 대문자 할당
		for(int i=0 ; i<alpahabets.length; i++, ch++){ 
			alpahabets[i] = ch;
		}
		// 대문자를 소문자로 변환
		for(int i=0; i<alpahabets.length; i++){
			alpahabets[i] = (char)( alpahabets[i] + 32);
		}
		// 변환된 소문자 출력
		for(int i=0 ; i<alpahabets.length; i++, ch++){
			System.out.println(alpahabets[i]);
		}
		
	}
}
