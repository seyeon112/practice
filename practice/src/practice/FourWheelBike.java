package practice;

public class FourWheelBike extends Bike{
	FourWheelBike(String riderName) {
		super(riderName);
	}
	
	@Override
	void info() {
		super.info();
	}
	
	void addWheel() {
		if (wheel == 2) {
			wheel = 4;
			System.out.println(riderName + "의 자전거에 보조 바퀴를 부착합니다.");
		} else {
			System.out.println(riderName + "의 자전거에 보조 바퀴가 이미 부착되어 있습니다.");

		}
	}
}
