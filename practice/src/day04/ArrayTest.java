package day04;

public class ArrayTest extends Exception{
	public static void main(String[] args) {
		int[] arData = {1, 3, 2, 6, 9};
		System.out.println(arData.length);
		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
//		
////		5, 4, 3, 2, 1
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = 5 - i;
//			System.out.println(arData[i]);
//		}
//		
		int[] arData2 = new int[5];
		System.out.println(arData.length);
		
		for (int i = 0; i < arData2.length; i++) {
			System.out.println(arData2[i]);
		}
	}
}
