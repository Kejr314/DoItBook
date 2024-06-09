package ifexample;

public class SwitchCase3 {

	public static void main(String[] args) {
		int floor = 5;
		String store;
		
		switch(floor) {
			case 1 : store = "1층 약국";
				break;
			case 2 : store = "2층 정형외과";
				break;
			case 3 : store = "3층 피부과";
				break;
			case 4 : store = "4층 치과";
				break;
			case 5 : store = "5층 헬스 클럽";
				break;
			default : store = "존재하지 않는 층";
		}
		System.out.println(store + "입니다.");
	}

}
