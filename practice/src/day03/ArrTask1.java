package day03;

public class ArrTask1 {
	public static void main(String[] args) {
//		(브론즈)
//		10~1까지 중 짝수만 배열에 담고 출력
//		10분
		
		int[] number = new int[5];
		for (int i = 0; i < number.length; i++) {
			number[i] = (i*2 + 2);
			System.out.println(number[i]);
		}
		
	}

}
