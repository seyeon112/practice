package section15;

public class EX15_11 {
	public static void main(String[] args) {
		String str = "1234-5678";
		String subStr = str.substring(5);
		
		System.out.println(subStr);
		
		String rangeStr = str.substring(0, 4);
		System.out.println("번위 내에서 추출 : " + rangeStr);
	}

}
