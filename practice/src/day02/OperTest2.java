package day02;

import java.util.Scanner;

public class OperTest2 {
	public static void main(String[] args) {
//		사용자에게 두 정수를 입력 받아서 대소를 비교하여 출력
//		관계연산자, 삼항연산자 이용
		
		Scanner scan = new Scanner(System.in);
		int num1, num2;
		String result;
		
		System.out.println("두 정수를 입력해줘 : ");
		num1 = Integer.parseInt(scan.next());
		num2 = Integer.parseInt(scan.next());
		
		result = num1 > num2 ? "더 큰 값 :" + num1 :
			num1 == num2 ? "두 수는 같아요" :
				"더 큰 값 : " + num2;
		System.out.println(result);
		
	}

}
