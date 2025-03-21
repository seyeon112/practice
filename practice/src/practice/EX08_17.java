package practice;

public class EX08_17 {
	public static void main(String[] args) {
		int[] studentA = {97, 53};
		int[] studentB = {97, 53};
		
		MidTerm mid = new MidTerm();
		int sumA = mid.score(studentA);
		int sumB = mid.score(studentB);
		
		if (sumA > sumB) {
			System.out.println("A 학생의 중간고사 성적이 더 높아요");
		} else if (sumA < sumB) {
			System.out.println("B 학생의 중간고사 총점이 더 높아요");
		} else {
			System.out.println("들이 똑같애요");
		}
	}

}
