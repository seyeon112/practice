package practice;

class Parent {}
class Child extends Parent {}

public class EX11_01 {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		Child c1 = new Child();
		
		Parent p2 = new Child();
		Parent p3 = c1;
		
		if(p3 == c1) {
			System.out.println("p3와 c1은 같은 객체를 참조하고 있습니다.");
		}
	}

}
