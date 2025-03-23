package acess1;

public class EX12_23 {
	public static void main(String[] args) {
		System.out.println("Tj 마이크 객체");
		TJmic tj = new TJmic();
		tj.connect();
		tj.music();
		tj.sing();
		System.out.println("Tjmic 객체를 블루투스마이크로 타입 변환");
		MIC bm = tj;
		bm.connect();
		bm.music();
		bm.sing();
		System.out.println("Tjmic 객체를 Microphone으로 타입 변환");
		Microphone m = tj;
		m.sing();
		System.out.println("Tjmic 객체를 Speaker로 타입 변환");
		Speaker s = tj;
		s.music();
	}

}
