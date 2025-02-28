package practice;

import java.util.Arrays;
import java.util.Comparator;

public class Test19 {
	public static void main(String[] args) {
//		버블 정렬
//		int[] arr = {1, 6, 2, 3, 10, 7, 4, 5, 8, 9};
//		
//		int temp = 0;
//		
//		for (int i = arr.length - 1; i > 0; i--) {
//			for (int j = 0; j < i; j++) {
//				if (arr[j] > arr[j + 1]) {
//					temp = arr[j + 1];
//					arr[j + 1] = arr[j];
//					arr[j] = temp;
// 				}
//			}
//		}
//		System.out.println("정렬 후 출력 : ");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
		
//		버블 정렬 2
//		int[] arr = {1, 4, 3, 6, 5, 8, 7, 9, 10, 14, 17};
////		임시변수로 배열의 방에 저장된 값을 옮겨줄것이다.
//		int temp = 0;
////		for문을 돌려서 배열의 길이만큼 방을 돌아가면서 비교해줘야 함. (버블 정렬)
//		for (int i = arr.length - 1; i > 0; i--) {
////		앞 방의 값보다 값이 더 크면 임시 변수, 
////		임시 변수에서 작은 값으로 값을 옮겨주는 로직.
//			for (int j = 0; j < i; j++) {
//				if (arr[j] > arr[j + 1]) {
//					temp = arr[j + 1];
//					arr[j + 1] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]);
//		}
		
//		int[] arr = {1, 6, 2, 3, 10, 7, 4, 5, 8, 9};
		
//		int temp = 0;
		
//		배열의 길이가 0이 될때까지 순환
//		for (int i = arr.length - 1; i > 0; i--) {
////			배열의 방 안에 저장된 값을 하나하나 검사
//			for (int j = 0; j < i; j++) {
//				if (arr[j] > arr[j + 1]) {
//					temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//				}
//			}
//		}
//	
//			System.out.println(Arrays.toString(arr));	
		
//		오름차순 정렬 자동으로 해주는 메서드
		
		Integer[] arr = {1, 6, 2, 3, 10, 7, 4, 5, 8, 9};
//		
//		System.out.println("정렬 전 배열 : " + Arrays.toString(arr));
//		Arrays.sort(arr);
//		System.out.println("정렬 후 배열 : " + Arrays.toString(arr));
		
//		내림차순 메서드
		
//		Arrays.sort(arr, Comparator.reverseOrder());
//		System.out.println("내림차순 :" + Arrays.toString(arr));
		
	}

}
