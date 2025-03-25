package section18;

class AddThreads implements Runnable {
	private Worker w;
	private String name;
	public AddThreads(String name, Worker w) {
		this.name = name;
		this.w = w;
	}
	
	@Override 
	public void run() {
		synchronized (w) {
			try {
				for (int i = 10; i > 1; i--) {
					Thread.sleep(100);
					w.addLuggage(i - 1);
					System.out.println(this.name + "현재 짐 : " + w.getLuggage());
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
}
public class WorkerThreadExample {
	public static void main(String[] args) {
		Worker w = new Worker();
		Thread th1 = new Thread(new AddThreads("1번" , w));
		Thread th2 = new Thread(new AddThreads("2번" , w));
		th1.start();
		th2.start();
	}

}
