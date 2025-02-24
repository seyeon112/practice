package practice;

public class Test6 {
	public static void main(String[] args) {
//		int num1 = 11;
//		double num2 = 3.14;
////		형변환 - 연산을 위해서, 서로 자료형이 다르면 연산 불가능함.
//		double num1Change = (double)num1;
//		
//		System.out.println("num1 : " + num1);
//		System.out.println("num1Change : " + num1Change);
//		System.out.println(num1Change + num2);
//		System.out.println((int)1.23);
//		int i1 = 10;
//		byte b1 = (byte)11;
//		System.out.println(b1);
//		int i2 = 128; 
//		byte b2 = (byte)i2;
////		저장 가능한 범위를 넘어섰기에, 음수부터 왼에서 카운트를 다시 시작한다.
////		결론적으로는 잘못된 값이 출력되었다.
//		System.out.println(b2);
		double d1 = 1.0e100;
		float f1 = (float)d1;
		System.out.println(f1);
		
		double d2 = 1.0e-100;
		float f2 = (float)d2;
		System.out.println(f2);
	}

}
