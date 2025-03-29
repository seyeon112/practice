package day05;

public class LocationTest {
	int[] test(int[] data) {
		data[0] = 20;
		return data;
	}
	
	public static void main(String[] args) {
		LocationTest It = new LocationTest();
//		메인 메소드와 외부 메소드에 정의된 data는 각각 다른 배열.
		int[] data = { 50 };
		It.test(data);
		System.out.println(data[0]);
	}

}
