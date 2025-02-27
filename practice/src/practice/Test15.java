package practice;

public class Test15 {
	public static void main(String[] args) {
//		int sum = 0;
		
//		int i -> 내가 원하는 초기값
//		조건식 : 숫자의 범위, 언제 멈추고 싶은지
//		증감식 : 숫자를 증가시킬지, 감소시킬지
//		실행문 : 구체적으로 어떤 행위를 할지, 결과값을 결정. 
//		for (int i = 10; i >= 0; i--) {
//			sum += i;
//		}
//		System.out.println("합 :" + sum);
		
//		합을 저장할 변수
		int sum = 0;
		
//		1부터 100까지 반복
		for (int i = 1; i <= 100; i++) {
			
//			2로 나누어 떨어지면 짝수
			if (i % 2 == 0) {
//				짝수의 합을 더한다.
				sum += i;
			}
		}
		System.out.println("합 :" + sum);
	}

}
