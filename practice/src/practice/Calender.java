package practice;

public class Calender {
	String color;
	int months;
	
	Calender(String color, int months) {
		this.color = color;
		this.months = months;
		
	}
	
	void info() {
		System.out.println(color + " 달력은 " + months + "월까지 있습니다." );
	}

	void hanging() {
		System.out.println(color + " 달력을 벽에 걸 수 있씁니다.");
	}
}
