package section14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsExceptionExample {
	public static void checkYourSelf (Scanner scan) throws InputMismatchException{
		System.out.println("1. 사람과 어울리는 것이 좋다 2. 혼자 어울리는 것이 좋다");
		System.out.print("선택 >>");
		int check = scan.nextInt();
		
		if (check == 1) {
			System.out.println("너는 ENFP");
		} else {
			System.out.println("너는 ISFP");
		}
	
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("성격 유형 검사를 시작합니ㅏㄷ.");
			ThrowsExceptionExample.checkYourSelf(scan);
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("키보드 입력이 잘못되었씁니다.");
		} finally {
			if(scan != null) {
				scan.close();
			}
		}
		System.out.println("프로그램 종료!");
	}

}
