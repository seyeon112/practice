package section18;

class TimeThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("스레드 출력 : " + (i + 1));
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
}
public class ThreadSleepExample {
	public static void main(String[] args) {
		TimeThread th = new TimeThread();
		th.start();
	}
}
