package day03;

import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
		String message = "1.분실 신고\n2.통신사 이동\n3.결제 수단 변경\n0.상담원 연결";
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		do {
			System.out.println(message);
			choice = sc.nextInt();
		} while (choice != 0);
	}

}
