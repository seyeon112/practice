package section15;

public class EX15_02 {
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		
		System.out.println("str1 vs str2 : " + (str1.equals(str2)));
		System.out.println("str2 vs str3 : " + (str2.equals(str3)));
	}

}
