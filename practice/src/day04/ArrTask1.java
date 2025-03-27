package day04;

public class ArrTask1 {
	public static void main(String[] args) {
//		(브론즈)
//		10~1까지 중 짝수만 배열에 담고 출력
//		10분
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (5-i)*2;
			System.out.println(arr[i]);
		}
	}

}
