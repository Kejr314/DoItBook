package project;

import java.util.*;

public class Menu {

	public void artist() {
		System.out.println("1. 비투비(BTOB)");
		System.out.println("2. (여자)아이들");
		System.out.println("3. Aespa");
		System.out.println("4. Tori Kelly");
		System.out.print("선택 : ");
		
		Scanner sc = new Scanner(System.in);
		int artist = sc.nextInt();
		ConcertInfo arti = new ConcertInfo();
		switch(artist) {
		case 1 : // 비투비
			arti.btob();
			break;
		case 2 : // (여자)아이들
			arti.gidle();
			break;
		case 3 : // 에스파
			arti.aespa();
			break;
		case 4 : // 토리 켈리
			arti.torikelly();
			break;
		default :
			System.out.println("잘못 입력하셨습니다.");
		}
	}


	public void reservationList() {
	}


	public void reservation() {
		System.out.println("< 아티스트 선택 >");
		System.out.println("1. 비투비(BTOB)");
		System.out.println("2. (여자)아이들");
		System.out.println("3. Aespa");
		System.out.println("4. Tori Kelly");
		System.out.print("선택 : ");
		
		Scanner sc = new Scanner(System.in);
		int artist = sc.nextInt();
		Reservation rsv = new Reservation();
		switch(artist) {
		case 1 : // 비투비
			rsv.btob();
			break;
		case 2 : // (여자)아이들
			rsv.gidle();
			break;
		case 3 : // 에스파
			rsv.aespa();
			break;
		case 4 : // 토리 켈리
			rsv.torikelly();
			break;
		default :
			System.out.println("잘못 입력하셨습니다.");
		}
	}

}
