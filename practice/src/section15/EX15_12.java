package section15;

public class EX15_12 {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Hello");
		str.append(" world");
		System.out.println(str);
		System.out.println("문자열 길이 : " + str.length());
		
		str.delete(0, 6);
		System.out.println(str);
		System.out.println("문자열 길이 : " + str.length());
		
		str.insert(0, "Hello");
		System.out.println(str);
		System.out.println("문자열 길이 : " + str.length());
		
		str.reverse();
		System.out.println(str);
	}

}
