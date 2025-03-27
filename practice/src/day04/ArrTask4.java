package day04;

import java.util.Scanner;

public class ArrTask4 {
	public static void main(String[] args) {
//		그룹 문제
//		정수를 한글로 변경하기
//		ex)
//		입력) 1024
//		출력) 일공이사
		
//		힌트
//		입력받은 정수를 문자열로 변경
//		어떤 배열 하나를 선언해서 한글을 담고 있어야 출력할 수 있다.
//		30분
		Scanner sc = new Scanner(System.in);
		String hanguel = "공일이삼사오육칠팔구";
		String message = "정수를 입력해주세여. : ";
		String num = sc.next();
		String result = "";
		
		for (int i = 0; i < num.length(); i++) {
			result += hanguel.charAt(num.charAt(i) - 48);
		}
		
		System.out.println(result);
	}

}
