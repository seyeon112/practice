package practice;

public class Student {
////	정적 멤버(필드)
//	static int age;
//
////	정적 메서드
//	static void introduce() {
//		System.out.println("안녕하세요");
	static String schoolName = "세종대학교";
	String studentName;
	static void goToSchool() {
		System.out.println("학교에 갑니다.");
	
	}
	
	void hello() {
		System.out.println("안녕하세요, 제 이름은 " + studentName + "입니다.");
	}
}
