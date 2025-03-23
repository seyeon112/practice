package section14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EX14_05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("점수를 입력하세요 : ");
			int score = scan.nextInt();
			
			if (score >= 65) {
				System.out.println("합격입니당");
			} else {
				System.out.println("합격입니당");
			}
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("키보드 입력을 확인해봐~");
		}
		
		scan.close();
		System.out.println("프로그램 종료!");
	}

}
