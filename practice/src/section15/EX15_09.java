package section15;

public class EX15_09 {
	public static void main(String[] args) {
		
		String str = "HelloWorld_MyWorld";
		
		System.out.println("World 단어 위치 : " + str.indexOf("World"));
		System.out.println("World 단어 위치 : " + str.indexOf("World", 10));
	}

}
