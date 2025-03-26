package day02;

public class StringTask {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 0, num3 = 0;
		String str1 = "8.24", str2 = "7.8";
		
//		10분
//		number1 + str1 + str2로 115만들기

		num2 = (int)Double.parseDouble(str1);
		num3 = (int)Double.parseDouble(str2);
		
		System.out.println(String.valueOf(num1) + (num2 + num3));
	}

}
