package day06;

public class ClassTask4 {
	
	public ClassTask4() {;}
	
//	최소값과 최대값을 구해주는 메서드 구현
//	return type은 Result타입이다.
	
	Result getMaxAndMin(int[] arData) {
		Result result = new Result(arData[0], arData[0]);
		
		for (int i = 0; i < arData.length; i++) {
			if (result.min > arData[i]) {
				result.min = arData[i];
			}
			if (result.max < arData[i]) {
				result.max = arData[i];
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		ClassTask4 classTask4 = new ClassTask4();
		int[] arData = {5, 6, 8, 2, 7};
		
		Result result = classTask4.getMaxAndMin(arData);
		
		System.out.println(result.max);
		System.out.println(result.min);
	}

}
