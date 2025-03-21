package practice;

import java.util.Scanner;

public class Test21 {
	public static void main(String[] args) {
//		int[][] arr = new int[3][];
//		
//		arr[0] = new int[2];  
//		arr[1] = new int[3];  
//		arr[2] = new int[1];  
		
//		최초 선언할 때만 가능
//		int[][] arr = { {1, 2}, {3, 4}, {5, 6} };
		
//		행과 열을 지정하며 선언
//		int[][] arr = new int[2][3];
//		
//		arr[0][0] = 1;
//		arr[0][1] = 2;
//		arr[0][2] = 3;
//		
//		arr[1][0] = 11;
//		arr[1][1] = 12;
//		arr[1][2] = 13;
//		
////		행의 주소 출력
//		System.out.println("2차원 배열 : " + arr);
////		행이 가진 열에 대한 주소 출력
//		System.out.println("2차원 배열 1행 : " + arr[0]);
//		
////		행의 크기 출력
//		System.out.println("행의 크기 출력 : " + arr.length);
////		각 행의 열 크기 출력
//		System.out.println("1 행의 열 크기 : " + arr[0].length);
//		System.out.println("1 행의 열 크기 : " + arr[1].length);
//		
////		1행 1열의 값 출력
//		System.out.println("arr[0][0] = " + arr[0][0]);
		
//		int[][] arr = new int[5][5];
//		
//		int count = 1;
//		
////		1부터 25까지 차례대로 배열에 값을 넣는다.
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				arr[i][j] = count++;
//			}
//		}
//		
////		배열 출력하기
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
//		int[][] lotto = {{2, 6, 11, 33, 42, 44},
//						 {1, 6, 17, 22, 24, 33},
//						 {7, 16, 24, 33, 42, 44},
//						 {11, 27, 32, 34, 43, 46},
//						 {6, 17, 22, 24, 33, 41}};
//		
////		키보드 입력을 받기 위한 스캐너
//		Scanner scan = new Scanner(System.in);
//		String myNum = "";
//		System.out.println("당첨될 숫자 6개를 연속으로 입력해주세요 >>");
//		myNum = scan.next();
//		
////		당첨 여부를 나타내는 변수
//		boolean isWin = false;
//		
//		for (int i = 0; i < lotto.length; i++) {
////			당첨 번호를 만들기 위한 변수
//			String lottoNumber = "";
//			for (int j = 0; j < lotto[i].length; j++) {
//				lottoNumber += lotto[i][j];
//				
//			}
////			문자열은 비교할 때 equals 함수를 사용하여 비교
//			if (myNum.equals(lottoNumber)) {
//				isWin = true;
//				break;
//			}
//		}
		
//		
//		if (isWin) {
//			System.out.println(myNum + " 번호 당첨!");
//		} else {
//			System.out.println(myNum + " 번호는 당첨되지 못했습니다.");
//		}
//		scan.close();
		
//		int[] score = {90, 92, 93};
//		
//		int sum = 0;
//		double avg = 0;
//		
//		for (int val : score) {
//			sum += val;
//		}
//		
//		avg = (double) sum / 3;
//		
//		System.out.println("총점 : " + sum + ", 평균 :" + avg);
		
//		복습 문제 풀이
//		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		int sum = 0;
//		
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] % 2 == 0) {
//				sum += arr[i];
//			}
//		}
//		
//		System.out.println("짝수들의 합 :" + sum);
		
//		철수는 동생과 카드 게임을 했습니다. 카드 게임에 사용된 카드는 중복되는 숫자 없이 총 10장입니다.
//		배열과 랜덤 함수를 이용해 철수가 게임에 사용했던 카드를 구해보세요.
//		카드에 적힌 숫자는 1부터 10이며, 카드는 섞여있으므로 순서는 상관이 없습니다.
		
//		1. 1부터 10까지인 카드덱 생성
//		int cards = (int) ((Math.random()*10000)%10));
		
	}
}
