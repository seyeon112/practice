package acess1;

public class BluetoothMIC implements Microphone, Speaker {
	@Override
	public void sing() {
		System.out.println("마이크에 대고 노래 부르기");
	}
	
	@Override
	public void music() {
		System.out.println("노래한다 햐햐");
	}
}
