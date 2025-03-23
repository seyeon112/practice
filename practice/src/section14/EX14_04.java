package section14;

public class EX14_04 {
	public static void main(String[] args) {
		int result = 0;
		
		try {
			result = 10 / 0;
			System.out.println("나누기 결과" + result);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("0으로 나누기 불가능합니다.");
		}
		System.out.println("프로그램 종료!");
	}

}
