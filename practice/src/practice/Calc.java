package practice;

public class Calc {
//	void sum(int num1, int num2) {
//		System.out.println("두 수의 합은" + (num1 + num2) + "입니다.");
//	}
//	void sum(int[] nums) {
//		int result = 0;
//		for (int i = 0; i < nums.length; i++) {
//			result += nums[i];
//			
//		}
//		
//		System.out.println("숫자들의 합은 " + result + "입니다.");
//	}
	public int sum(int[] nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			result += nums[i];
		}
		
		return result;
	}

}
