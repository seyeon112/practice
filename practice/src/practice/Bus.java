package practice;

public class Bus extends Car {
//	void take(int m) {
//		while(true) {
//			if(m < 3000) {
//				System.out.println("교통카드 충전하러 갑니다");
//				return;
//			}
//			System.out.println("버스를 탑니다.");
//			m -= 1250;
//		}
//	}

	int peopleNum;
	
	Bus(int peopleNum) {
		this.peopleNum = peopleNum;
	}
	
	void takePerson() {
		System.out.println("승객이 버스에 탔습니다.");
		peopleNum++;
		System.out.println("지금까지 탑승한 승객은 " + peopleNum + "입니다.");
	}
}
