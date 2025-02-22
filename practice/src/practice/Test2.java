package practice;

public class Test2 {
//		서식문자
	public static void main(String[] args) {
		System.out.printf("저는 뉴진스대학교 %d학년에 재학중입니다!", 3);
//		2가지 이상의 서식문자를 이용헤 데이터 출력 = 묶어서 순서대로 출력
		System.out.printf("%d는 첫번째, %f은 두번째, %s은 세번쨰", 1, 2.0, "셋");
//		n칸만큼 확보한 후, 오른쪽 정렬하여 출력합니다.
		System.out.println();
		System.out.printf("%5d", 1);
		System.out.println();
		System.out.printf("%5d", 12);
		System.out.println();
		System.out.printf("%5d", 123);
		System.out.println();
		System.out.printf("%5d", 1234);
		System.out.println();
		System.out.printf("%5d", 12345);
		System.out.println();
//		%-nd
		System.out.printf("%-5d", 12345);
		System.out.println();
		System.out.printf("%-5d", 1234);
//		소수점 출력하기(float)
		System.out.printf("%.1f", 1.1234567);
		System.out.println();
		System.out.printf("%.2f", 1.1234567);
		System.out.println();
		System.out.printf("%.3f", 1.1234567);
		System.out.println();
		System.out.printf("%.4f", 1.1234567);
	}
	

}
