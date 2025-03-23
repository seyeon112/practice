package practice;

public abstract class Phone {
	abstract void openingLogo();
	
	void powerOn() {
		openingLogo();
		System.out.println("핸드폰이 켜짐.");
	}
	
	void powerOff() {
		System.out.println("핸드폰이 꺼짐.");
	}

}
