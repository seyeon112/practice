package practice;

import java.util.Iterator;

public class Test16 {
	public static void main(String[] args) {
//		int count = 0;
//		for (int i = 0; i < 10; i++) {
//			
//			for (int j = 0; j < 10; j++) {
//				count++;
//			}
//		}
//		System.out.println("반복 횟수 :" + count);
//		for (int i = 2; i <= 9; i++) {
//			for (int j = 0; j <= 9; j++) {
//				System.out.println(i + "X" + j + "=" + (i * j) + "\t");
//			}
//		}
//		System.out.println();
//		for (int i = 1; i <= 9; i++) {
//			for (int j = 2; j <= 9; j++) {
//				System.out.println(j + "X" + i + "=" + (i * j) + "\t");
//			}
//		}
		
//		for (int i = 0; i < 7; i++) {
////			공백이 하나씩 줄어들게 된다.
//			for (int j = 0; j < 7 - i; j++) {
//				System.out.print(" ");
//			}
////			별 모양은 홀수로 늘어난다.
//			for (int k = 0; k < (2*i) + 1; k++) {
//				System.out.print("*");
//			}
////			줄을 바꾼다.
//			System.out.println();
//		}

//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= 5-i; j++) {
//				System.out.print("c");
//			}
//			for (int k = 1; k <= (2*i)-1; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for (int i = 5; i >= 1; i--) {
////			공백 신경 안쓰고 별찍기
////			j가 0으로 시작해서, j가 i랑 동일하다면 *를 출력하고
////			j 값이 증가.
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		위아래 별찍기
//		for (int i = 1; i < 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for (int i = 5; i >= 1; i--) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for (int i = 1; i < 5; i++) {
//			for (int j = 0; j <= 5-i; j++) {
//				System.out.print("y");
//			}
//			for (int k = 0; k < (2*i)-1; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for (int i = 0; i <= 5; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print("y");
			}
			for (int j = 1; j <= 4; j++) {
				System.out.print("*");
			}
			for (int j = 1; j <= 10-i*2; j++) {
				System.out.print("y");
			}
			for (int j = 1; j <= 4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
