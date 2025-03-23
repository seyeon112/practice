package practice;

public class EX12_08 {
	public static void main(String[] args) {
		PineapplePhone pp = new PineapplePhone();
		pp.powerOn();
		pp.powerOff();
		
		System.out.println();
		
		Phone tp = new ThreeStarPhone();
		tp.powerOn();
		tp.powerOff();
	}

}
