package practice;

import java.util.Scanner;

public class Test13 {
	public static void main(String[] args) {
//		int favorite = 7;
//		
//		if(favorite < 5) {
//			System.out.println("좋아하는 숫자가 5보다 작습니다.");
//		}else if (favorite > 5) {
//			System.out.println("좋아하는 숫자는 5보다 큽니다.");
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
//		if (age > 19) {
//			System.out.println("성인입니다.");
//		} else if(age > 13) {
//			System.out.println("청소년입니다.");
//		} else if(age > 6) {
//			System.out.println("어린이입니다.");
//		} else {
//			System.out.println("유아입니다.");
//		}
		String result = (age > 19) ? "성인입니다." : (age > 13) ? "청소년입니다." : (age > 6) ? "어린이입니다." : "유아입니다.";
		System.out.println(result);
	}

}
