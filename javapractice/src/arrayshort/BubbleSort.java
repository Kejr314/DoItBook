package arrayshort;

public class BubbleSort {

	public static void main(String[] args) {
//		< 버블정렬 >
//		1. 배열의 첫 번째 요소부터 인접한 요소와 비교
//		2. 만약 인접한 요소의 순서가 잘못되어 있다면 위치를 교환
//		3. 배열의 끝까지 이동하면서 위의 과정을 반복
//		4. 한 번의 반복이 끝나면 가장 큰 요소가 배열의 마지막으로 이동
//		5. 위의 과정을 배열이 정렬될 때까지 반복
		
		int arrs[] = {7, 4, 5, 1, 3};
		int n = arrs.length;
		
		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j < n-1-i; j++) {
				if(arrs[j] > arrs[j+1]) { // 현재 원소가 다음 원소보다 큰 경우 교환
					int temp = arrs[j]; // temp에 현재 원소 저장
					arrs[j] = arrs[j+1]; // 현재 원소 자리에 다음 원소 이동
					arrs[j+1] = temp; // 다음 원소 자리에 현재 원소 이동
				}
			}
		}
		for(int num : arrs) {
			System.out.print(num + " ");
		}
	}

}
