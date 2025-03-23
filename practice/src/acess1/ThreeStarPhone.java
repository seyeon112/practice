package acess1;

public class ThreeStarPhone implements Phone{
	int batteryCapacity = 35;
	boolean isOn = false;
	
	@Override
	public void powerOn() {
		if (batteryCapacity > 30) {
			System.out.println("@@@켜저써!! @@@\n");
			isOn = true;
		} else {
			System.out.println("배터리가 적네...");
		}
		
	}
	
	@Override
	public void powerOff() {
		System.out.println("@@@꺼져써!! @@@\n");
		isOn = false;
	}
	
	@Override
	public boolean isOn() {
		if (isOn) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override 
	public void watchUtube() {
		if (batteryCapacity > 10) {
			System.out.println("watching Utube");
			batteryCapacity -= 10;
			System.out.println("잔여배터리 ... " + batteryCapacity + "%\n");
		} else {
			System.out.println("배터리가 부족해...");
			powerOff();
		}
	}
	
	@Override
	public void charge() {
		if (batteryCapacity < Phone.MAX_BATTERY_CAPACITY - 20) {
			System.out.println("충전중");
			batteryCapacity += 5;
			System.out.println("잔여 베터리..." + batteryCapacity + "%\n");
		} else {
			System.out.println("You dont have to charge");
			System.out.println("its enough..." + batteryCapacity + "%");
		}
	}
}
