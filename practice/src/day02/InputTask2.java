package day02;

import java.util.Scanner;

public class InputTask2 {
	public static void main(String[] args) {
//		3개의 정수를 한 번에 입력받은 후
//		세 정수의 곱셈을 출력
//		next(); 
		
		Scanner scan = new Scanner(System.in);
		int number1 = 0, number2 = 0, number3 = 0, result = 0;
		String format = "%d * %d * %d = %d";
		
		System.out.println("안녕, 정수 3개 입력해줘");
		System.out.println("첫번째 정수 :");
		System.out.println("두번째 정수 :");
		System.out.println("세번째 정수 :");
		
		number1 = Integer.parseInt(scan.next());
		number2 = Integer.parseInt(scan.next());
		number3 = Integer.parseInt(scan.next());
		
		result = number1 * number2 * number3;
		
		System.out.printf(format, number1, number2, number3, result);
		
	}

}
