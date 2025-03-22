package practice;

public class EX11_05 {
	public static void main(String[] args) {
		
		DeskCalender dc = new DeskCalender("보라색", 6);
		dc.info();
		dc.hanging();
		dc.onTheDesk();
		
		System.out.println();
		
		Calender c = new DeskCalender("검은색", 12);
		c.info();
		c.hanging();
		
	}

}
