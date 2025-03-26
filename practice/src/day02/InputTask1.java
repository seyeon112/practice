package day02;

import java.util.Scanner;

public class InputTask1 {
	public static void main(String[] args) {
//		두 정수를 입력한 뒤 덧셈 결과를 출력
//		단, next()만 사용한다.
//		경품 초코송이, 15분 
		
		Scanner scan = new Scanner(System.in);
		int number1 = 0, number2 = 0, result = 0;
		System.out.println("안녕? 정수 두개를 입력해봐");
		System.out.println("첫번째 정수 : ");
		System.out.println("두번째 정수 : ");
		String format = "%d + %d = %d";
		
		number1 = Integer.parseInt(scan.next());
		number2 = Integer.parseInt(scan.next());
		
		result = number1 + number2;
		
		System.out.printf(format, number1, number2, result);
	}

}
