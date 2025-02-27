package practice;

import java.util.Scanner;

public class Test12 {
	public static void main(String[] args) {
//		int result = 0;
//		if (3 > 2) {
//			result = 3;
//		}
//		System.out.println(result);
//		Scanner sc = new Scanner(System.in);
//		System.out.println("나이를 입력하세요");
//		
//		int age = sc.nextInt();
//		if (age > 19) {
//			System.out.println("성인입니다.");
//		}
//		System.out.println("프로그램을 종료합니다.");
//		int형 변수 num에 정수 10을 저장하고, 숫자가 5 이상이면 "num은 5보다 큽니다."라고 출력해주세요.
//		int num = 10;
//		if (num >= 5) {
//			System.out.printf("%d은 5보다 큽니다.", num);
//		}
		
//		int num = 5;
//		
//		if (num > 4) {
//			System.out.println(num + "은 4보다 큽니다.");
//		} else {
//			System.out.println(num + "은 4보다 작습니다.");
//		}
//		int a = 4;
//		int b = 10;
//		int max = 0;
//		
//		if (a > b) {
//			max = a;
//			
//		} else {
//			max = b;
//		}
//		
//		System.out.println(a + "와" + b + " 중에 큰 수는 " + max + "입니다,");
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("나이를 입력하세요.");
//		
//		int age = sc.nextInt();
//		
//		if (age > 19) {
//			System.out.println("성인입니다.");
//			
//		} else {
//			System.out.println("미성년자입니다.");
//
//		}
//		삼항연산자로 바꿔보기
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요.");
		
		int age = sc.nextInt();
		
		String result = (age > 19) ? "성인입니다" : "미자입니다";
		
		System.out.println(result);
		
		}

}
