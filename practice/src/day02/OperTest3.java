package day02;

import java.util.Scanner;

public class OperTest3 {
//	심리테스트(브론즈), 번호로 입력 받기
//	Q. 당신이 좋아하는 색을 선택하세요.
//	1. 빨간색
//	2. 노란색
//	3. 검은색
//	4. 흰색
//	
//	빨간색 : 불같고 열정적이고 적극적이다.
//	노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다.
//	검은색 : 묵묵하고 든든하고 냉철하고 멋지다.
//	흰색 : 천사같고 깔끔하고 정리를 좋아하고  배려심이 많다.
	
//	삼항연산자, 논리연산자, nextInt()
	
	public static void main(String[] args) {
		System.out.printf("Q. 당신이 좋아하는 색을 선택하세요.\n"
				+ "1. 빨간색\n"
				+ "2. 노란색\n"
				+ "3. 검은색\n"
				+ "4. 흰색");
		
		String red = "빨간색 : 불같고 열정적이고 적극적이다.", 
				yellow = "노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다.", 
				black = "검은색 : 묵묵하고 든든하고 냉철하고 멋지다.",
				white = "흰색 : 천사같고 깔끔하고 정리를 좋아하고  배려심이 많다.";
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		String result = number == 1 ? red
				: number == 2 ? yellow
					: number == 3 ? black
						: white;
		
		System.out.println(result);
				
	}

}
