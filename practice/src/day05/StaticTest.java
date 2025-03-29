package day05;

public class StaticTest {
	
	int data = 10;
	static int data_s = 10;
	
	public StaticTest() {;}
	
	void increase() {
		System.out.println(++data);
	}
	
	void increase_s() {
		System.out.println(++data_s);
	}
	
	public static void main(String[] args) {
		StaticTest st = new StaticTest();
		st.increase();
		st.increase();
		st.increase();
		st.increase();
		st.increase();
		st.increase();
		st = new StaticTest();
		st.increase();
		st.increase();
		st.increase();
	}
	

}
