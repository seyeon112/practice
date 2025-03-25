package section18;

//class whiteFlag implements Runnable {
//	@Override
//	public void run() {
//		while(true) {
//			System.out.println("백기 올려");
//		}
//	}
//}

public class RunnableExample {
	public static void main(String[] args) {
//		Runnable white = () -> {
//			while(true) {
//				System.out.println("백기 올려");
//			}
//		};
//		
//		Thread whiteFlag = new Thread(white);
//		whiteFlag.start();
		Runnable blue = () -> {
			while(true) {
				System.out.println("청기 올려");
			}
		};
		
		Runnable white = () -> {
			while(true) {
				System.out.println("백기 올려");
			}
		};
		
		Thread blueFlag = new Thread(blue);
		Thread whiteFlag = new Thread(white);
		
		blueFlag.start();
		whiteFlag.start();
	}

}
