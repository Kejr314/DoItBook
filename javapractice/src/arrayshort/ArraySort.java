package arrayshort;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		
		int [] opens = {24, 5, 7};
		
		Arrays.sort(opens); // Array.sort 메서드 사용. 오름차순으로 정렬
		System.out.print("Array.sort 오름차순 : ");
		for(int i : opens) { // 배열opens의 인덱스를 첫 번째 요소부터 마지막 요소까지 순서대로 반복
			System.out.print(i + " ");
		}
		// 출력 결과 : 5, 7, 24
		
		System.out.println();
		
		Arrays.sort(opens);
		System.out.print("Array.sort 내림차순 : ");
		for(int i = opens.length - 1; i >= 0; i--) { // 배열 opens의 인덱스를 마지막 요소부터 첫 번째 요소까지 역순으로 반복
			System.out.print(opens[i] + " ");
		}
		// 출력 결과 : 24, 7, 5
	}
}
