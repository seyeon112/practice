package day02;

public class OperTest {
	public static void main(String[] args) {
		boolean isTrue = 10 != 11;
		System.out.println(isTrue);
		System.out.println(isTrue || 10 != 10);
		System.out.println(isTrue && !(10 != 10));
		System.out.println(isTrue || 10 != 10);
	}

}
