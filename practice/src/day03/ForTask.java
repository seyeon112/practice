package day03;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
//		10분
//		(브론즈)
//		1~100까지 출력
//	int[] arr = new int[100];
//	for (int i = 0; i < arr.length; i++) {
//		arr[i] = i + 1;
//		System.out.println(arr[i]);
//	}
	
//	100~1까지 출력
	
//	int[] arr2 = new int[100];
//	for (int i = 0; i < arr.length; i++) {
//		arr2[i] = 100 - i;
//		System.out.println(arr2[i]);
//	}
	
//	1~100까지 짝수만 출력
	
//	int[] arr3 = new int[100];
//	for (int i = 0; i <= 100; i+=2) {
//		System.out.println(i);
//	}
//	
//	for (int i = 0; i < arr3.length; i++) {
//		arr3[i] = (i + 1) * 2;  
//	}
	
//	for (int i = 0; i <= 100; i++) {
//		if (i % 2 != 0) {
//			continue;
//		}
//		System.out.println(i);
//	}
	
	
//	1~10까지 합을 출력
//	합을 담을 변수가 필요하다.
//	10번 반복한다. (for문)
//	반복을 돌려서 변수에 누적합한다.
//	출력한다.
	
//	int sum = 0;
//	for (int i = 0; i < 10; i++) {
//		sum += i + 1;
//		
//	}
//	System.out.println(sum);
	
//	(골드)
//	1~n까지 합을 출력
//	ex) 사용자가 15를 입력하면 1~15까지 합을 출력
//	
//	Scanner scan = new Scanner(System.in);
//	int num = Integer.parseInt(scan.next());
//	int result = 0;
//	for (int i = 0; i < num; i++) {
//		result += i + 1;
//	}
//	
//	System.out.println(result);
	
//	(플레티넘)
//	A ~ F까지 출력, 목표
	
//	for (int i = 0; i < 6; i++) {
//		System.out.println((char)(97 + i));
//	}
	
//	A ~ F까지 C를 제외하고 출력, if문은 사용불가
	
//	for (int i = 0; i < 5; i++) {
//		System.out.println((char)(i >= 2 ? 66 + i : 65 + i));
//	}
	
//	(다이아)
//	012340123401234 출력
//	int[] arr = new int[5];
//	for (int j = 0; j < 3; j++) {
//		for (int i = 0; i < 5; i++) {
//			arr[i] = i;
//			System.out.print(arr[i]);
//		}	
//	}
	
//		(마스터)
//	      *
//		 ***
//		*****
//	   *******
//  *********
		
		for (int i = 0; i < 10; i+=2) {
			for (int j = 10; j > i; j-=2) {
				System.out.print(" ");
			}
			for (int k = 1; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	

	}

}
