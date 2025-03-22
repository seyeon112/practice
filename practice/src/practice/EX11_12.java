package practice;

public class EX11_12 {
	public static void main(String[] args) {
		ComputerRoom cr = new ComputerRoom();
		cr.computer1 = new LZ();
		cr.computer2 = new Samsung();
		
		cr.allPowerOn();
		cr.allPowerOff();
		
		System.out.println();
	}

}
