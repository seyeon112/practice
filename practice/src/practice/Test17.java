package practice;

import java.util.Iterator;
import java.util.Scanner;

public class Test17 {
	public static void main(String[] args) {
//		int sum = 0;
//		int i = 1;
//		
//		while (i <= 10) {
//			sum += i;
//			i++;
//		}
//		System.out.println("합 :" + sum);
		
//		int sum = 0;
//		int i = 1;
//		
//		do {
//			sum += i;
//			i++;
//		} while (i <= 10);
//		
//		System.out.println(sum);
//		물통에 물을 10번 채워라
//		int bottle = 0;
//		for (int i = 1; i <= 10; i++) {
//			bottle += 1;
//		}
//		System.out.println(bottle);
		
//		int sum = 0;
//		for (int i = 1; i <= 100; i++) {
//			
//			if (i % 2 != 0) {
//				continue;
//			}
//			sum += i;
//		}
//		System.out.println("짝수 합 :" + sum);
//		int magicNumber = (int)(Math.random() * 50) + 1;
//		Scanner scan = new Scanner(System.in);
//		boolean isMatched = false;
//		
//		for (int i = 0; i < 10; i++) {
//			System.out.println("찾는 숫자를 입력 >> ");
//			int guess = scan.nextInt();
//			
//			if (guess == magicNumber) {
//				System.out.println((i + 1) + "번째에 맞췄습니다!");
//				isMatched = true;
//				break;
//			} else if(guess > magicNumber) {
//				System.out.println("맞춰야할 숫자가 더 작습니다");
//			} else if (guess < magicNumber) {
//				System.out.println("맞춰야할 숫자가 더 큽니다!");
//			}
//			
//		}
//		
//		if (!isMatched) {
//			System.out.println("정답을 맞추지 못했씁니다.");
//		}
		
//		1부터 100까지의 정수 중에서 짝수만을 더해 출력하는 코드를
//		for문을 사용해 작성해 보세요.
//		int num = 0;
//		
//		for (int i = 1; i <= 100; i++) {
//			if (i % 2 != 0) {
//				continue;
//			}
//			num += i;
//		}
//		System.out.println(num);
		
//		두 개의 주사위가 같은 값이 나올 때까지 while문을 사용해 반복하고,
//		반복 횟수와 주사위 눈의 번호를 출력해보세요.
//			int count = 0;
//			int box1 = 1;
//			int box2 = 0;
//		
//			while (box1 != box2) {
//				box1 = (int)(Math.random() * 6) + 1;
//				box2 = (int)(Math.random() * 6) + 1;
//				count++;
//				System.out.println("(" + box1 + ", " + box2 + ")");
//			}
//			System.out.println(count);
//		
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < 4 - i; j++) {
//				System.out.print(" ");
//			}
//			for (int k = 0; k < i+1; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 6 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (2*i) + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
