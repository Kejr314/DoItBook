package project;

import java.util.*;

public class Concert {
	
	// 1. 아티스트(artist) 선택
	// 2. "콘서트 정보(Concert Info) : 콘서트명(title), 관람일시(dDay), 장소(address), 가격(price), 주최(host)" 출력
	// 3. 선예매(preReservation)
	// 4. 멤버십 인증 ->  멤버십번호(membershipNumber) 입력 > 멤버십 가입 여부
	// 4-1. 멤버십 미가입 -> "선예매 대상이 아닙니다. 멤버십 가입 여부를 확인해주세요." "일반 예매 오픈 : year년 month월 day일 weekend요일 hour:miniute" 문구 출력
	// 4-2. 멤버십 회원 인증 완료 -> "선예매 대상입니다." 문구 출력
	// 4-2-1. 선예매 시작날짜(startDate) <= 현재날짜(currentDate) -> 6. 예매하기로 이동
	// 4-2-2. 선예매 시작날짜 > 현재날짜 -> "선예매 오픈 : month/day hour:miniute" 문구 출력
	// 5. 일반예매(generalReservation)
	// 4-1-1. 일반 예매 시작날짜 <= 현재날짜 -> 6. 예매하기로 이동
	// 4-1-2. 일반 예매 시작날짜 > 현재날짜 -> "일반 예매 오픈 : year년 month월 day일 weekend요일 hour:miniute" 문구 출력
	// 6. 예매하기(reserve)
	// 7. 관람일시 선택
	// 8. 좌석(seatConcert) 선택
	// 9. 결제(payment)
	// 9-1. 카드 결제(creditCard)
	// 9-2. 무통장 입금(withoutBankbook)
	// 10. 예매정보(reservationInfo)
	// 콘서트명
	// 예매번호(reservationNumber) : 알파벳+숫자10자리
	// 예매일(reservationDate) : 현재 날짜(year.month.day(weekend)
	// 관람일시 : year.month.day(weekend) hour:miniute
	// 장소 : 
	// 좌석 : 객석n층 nn열 nn
	// 예매자명(reservationName) : 홍길동
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("      [ 콘서트 ]      ");
		System.out.println("1. 콘서트 정보");
		System.out.println("2. 예매하기");
		System.out.println("2. 예매내역");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		Menu menu = new Menu();
		Reservation rsv = new Reservation();
		switch(choice) {
		case 1 : // 1. 아티스트
			menu.artist();
			break;
		case 2 : // 2. 예매하기
			menu.reservation();
		case 3 : // 3. 예매내역
			menu.reservationList();
			break;
		default : 
			System.out.println("잘못 입력하셨습니다.");
		}
	}
}
