package practice;

public class EX11_08 {
	public static void main(String[] args) {
		Bike b = new FourWheelBike("윤기");
		b.info();
		b.ride();
		
		System.out.println();
		
		FourWheelBike fwb = (FourWheelBike) b;
		fwb.addWheel();
		fwb.info();
		fwb.ride();
	}

}
