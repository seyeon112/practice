package section15;

public class EX15_13 {
	public static void main(String[] args) {
		System.out.println("3.51 올림 :" + Math.ceil(3.51));
		System.out.println("3.51 내림 :" + Math.floor(3.51));
		System.out.println("3.51 반올림 :" + Math.round(3.51));
		System.out.println("절대값 1 :" + Math.abs(-4.55));
		System.out.println("절대값 2 :" + Math.abs(-50));
		int maxValue = Math.max(30, 60);
		int minValue = Math.min(30, 60);
		
		System.out.println("최소값 : " + minValue);
		System.out.println("최대값 :" + maxValue);
	}

}
